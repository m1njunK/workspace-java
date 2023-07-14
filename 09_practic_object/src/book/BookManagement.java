package book;

import java.util.Scanner;

public class BookManagement {

	// 문자열 입력
	Scanner scanLine = new Scanner(System.in);
	// 선택번호 입력
	Scanner scanSelectNum = new Scanner(System.in);
	
	// 도서목록
	Book[] books = new Book[100];
	// 프로그램 실행 flag
	boolean isRun = true;
	// 메인 메뉴 선택 번호
	int selectNo = 0;
	// 도서관리 번호
	int count=1;	

	public BookManagement(){
		run();
	}
	
	public void run() {
		while(isRun) {
			System.out.println("================================================");
			System.out.println("1.도서등록 | 2. 도서목록 | 3.도서수정 | 4.도서삭제 | 5. 종료");
			System.out.println("================================================");
			selectNo = getSelectNum("번호를 선택하세요 > ");
			
			switch(selectNo) {
				case 1 :
					registerBook();
					break;
				case 2 :
					selectBook();
					break;
				case 3 :
					updateBook();
					break;
				case 4 : 
					deleteBook();
					break;
				case 5 : 
					terminate();
					break;	
				default : 
					System.out.println("등록된 메뉴가 아닙니다.");
			
			}
		}
	}
	
	// 프로그램 종료
	public void terminate() {
		System.out.println("프로그램 종료");
	}

	// 도서 등록
	public void  registerBook() {
		System.out.println("1. 도서등록");
		String title = getData("등록할 책의 제목을 입력하세요 > ");
		String author = getData("등록할 책의 저자를 입력하세요 > ");
		System.out.println("등록완료");
		
		books[count-1] = new Book(count, title, author);
		count++;
	}
	
	// 도서 목록 출력
	public void selectBook() {
		System.out.println("2. 도서목록");
		
		for(Book book : books) {
			if(book != null)
			printBookInfo(book);
		}
		
	}

	// 도서 정보 수정
	public void updateBook() {
		System.out.println("3. 도서수정");
		int bookNum = getSelectNum("수정할 책의 도서관리번호를 입력하세요 > ");
		
		Book findBook = findBook(bookNum);
		
		if(findBook != null) {
			System.out.println(findBook);
			a : while(true) {
			System.out.println("=================================");
			System.out.println("1. 제목 수정 | 2. 저자 수정 | 3. 수정완료");
			System.out.println("=================================");
			int next = getSelectNum("번호입력 > ");
			
			switch(next) {
				case 1 :
					System.out.println("제목 수정");
					String newTitle = getData("제목입력 > ");
					findBook.title = newTitle;
					break;
				case 2 :
					System.out.println("저자 수정");
					String newAuthor = getData("저자입력 > ");
					findBook.author = newAuthor;
					break;
				case 3 :
					System.out.println("수정완료");
					break a;
				}
			}
		}
	}
	
	// 도서 목록에서 책 정보 삭제
	public void deleteBook() {
		System.out.println("4. 도서삭제");
		int remove = getSelectNum("삭제할 책의 도서관리번호를 입력하세요 > ");
		Book removeBook = findBook(remove);
		
		if(removeBook != null) {
			for(int i = 0 ; i < books.length ; i++) {
				if(removeBook.equals(books[i])) {
					books[i] = null;
					System.out.println("삭제완료");
					break;
				}
			}
		}
	}
	
	// 책 정보 출력
	public void printBookInfo(Book b) {
		System.out.println(b.toString());
	}
	
	// 도서관리번호로 책 정보 찾기
	public Book findBook(int num) {
		for(Book book : books) {
			if(book != null && book.num == num) {
				return book;
			}
		}
		return null;
	}
	
	// 사용자에게 메시지를 전달 받아 출력하고 문자열 값 받아 반환
	String getData(String message) {
		System.out.println(message);
		return scanLine.nextLine();
	}
	
	// 번호 선택 받기
	int getSelectNum(String message) {
		System.out.println(message);
		if(!scanSelectNum.hasNextInt()) {
			System.out.println("숫자를 입력해주세요.");
			scanSelectNum.next();
			return 0;
		}
		return scanSelectNum.nextInt();
	}
		
	public static void main(String[] args) {
		new BookManagement();
	}

}
