package guide_book;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookManagement extends AppBase
{
	
	public static void main(String[] args) {
		new BookManagement();
	}

	@Override
	public void registerBook() {
		System.out.println("1. 도서등록");
		String title = getData("등록할 도서의 제목을 입력해 주세요 > ");
		String autor = getData("등록할 도서의 저자를 입력해 주세요 > ");

		long leg = System.currentTimeMillis();	
		
		Book book = new Book(count, title, autor, leg);

		if(!bookList.isEmpty()) {
			for(int i = 0; i < bookList.size(); i++) {
				if(bookList.contains(book)) {
					System.out.println("동일 제목의 도서가 존재합니다.");
					return;
				}
			}
		}
		
		bookList.add(book);
		count++;
		System.out.println("등록완료");

	}

	@Override
	public void selectBook() {
		System.out.println("2. 도서목록");
		for(Book book : bookList) {
			System.out.println(book);
		}
	}

	@Override
	public void updateBook() {
		System.out.println("3. 도서수정");
		int getNum = getNum("수정 하실 책의 관리번호를 입력해주세요.");
		Book book = findBook(getNum);
		if(book == null) {
			System.out.println("입력하신 번호의 책이 존재하지 않습니다.");
			return;
		}
		System.out.println(book);
		
		a : while(true) {
		System.out.println("==============================");
		System.out.println("1.제목수정| 2.저자수정 | 3.수정완료");
		System.out.println("==============================");
			selectNo = getNum("번호 입력 > ");
			switch(selectNo){
				case 1 :
					System.out.println("제목수정");
					String title = getData("제목입력 > ");
					book.setTitle(title);
					System.out.println("제목 수정 완료");
					break;
				case 2 : 
					System.out.println("저자수정");
					String autor = getData("저자입력 > ");
					book.setAuthor(autor);
					System.out.println("저자 수정 완료");
					break;
				case 3 :
					System.out.println("수정완료");
					break a;
				default :
					System.out.println("등록된 메뉴가 아닙니다.");
					break;
			}
		}
	}

	@Override
	public void deleteBook() {
		System.out.println("4. 도서삭제");
		int delete = getNum("삭제할 도서의 관리번호를 입력해주세요.");
		if(findBook(delete) == null) {
			System.out.println("존재X");
			return;
		}
		
		bookList.remove(findBook(delete));
		System.out.println("삭제완료");
	}

	@Override
	public void saveBook() {
		
		File file = new File("book.dat");
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(bookList);
			
			oos.flush();
			oos.close();
			System.out.println("저장 완료");
			
		} catch (IOException e) {
			System.out.println("저장 실패 : " + e.getMessage());
		}
		
		
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void readFileBookList() {
		
		File file = new File("book.dat");

		try {
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("파일생성완료");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			
			//List 라는 객체 타입으로 저장된 값을 입력받음
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			bookList = (List<Book>) ois.readObject();
			ois.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			bookList = new ArrayList<>();
		} finally {
			isRun = true;
			System.out.println(bookList.size() + "권의 책이 등록되어 있습니다.");
			if(!bookList.isEmpty()) {
				Collections.sort(bookList);
				count = bookList.get(0).getNum();
			}
			count++;
		}
	}

}




