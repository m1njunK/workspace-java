package f01_file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileExample {

	public static void main(String[] args) {
		// 물리적인 file or directory에 대한 
		// 정보 및 제어에 대한 기능을 제공하는 class
		String path = "c:\\Temp\\temp.txt";
		System.out.println(path);
		String separator = File.separator;
		System.out.println(separator);
		path = "c:"+File.separator+"Temp"+File.separator+"dir";
		System.out.println(path);
		char separatorChar = File.separatorChar;
		System.out.println(separatorChar);
		
		File file = new File(path);
		// File 객체에 지정된 디렉토리 또는 파일의 절대 경로를 반환
		String absolutePath = file.getAbsolutePath();
		System.out.println(absolutePath);
		// exists 해당위치에 지정된 폴더나 파일이 존재하면 true
		// 존재하지 않으면 false
		if(file.exists()) {
			System.out.println("디렉토리 존재");
		}else {
			System.out.println("디렉토리가 존재하지 않습니다.");
			// 경로상에 존재하지 않는 마지막 디렉토리 생성
			boolean isMaked = file.mkdir();
			System.out.println("디렉토리 생성 여부 : "+isMaked);
			isMaked = file.mkdirs();
			System.out.println("디렉토리 생성 여부 : "+isMaked);
		}
		
		File file2 = new File(file,"file.txt");
		absolutePath = file2.getAbsolutePath();
		System.out.println(absolutePath);
		
		if(!file2.exists()) {
			try {
				// 파일 생성
				file2.createNewFile();
				System.out.println("파일 생성 완료");
			} catch (IOException e) {
				System.out.println("파일 생성 실패 : " + e.getMessage());
			}
		}
		
		// 프로젝트 경로
		File file3 = new File("");
		System.out.println("file 3 : "+file3.getAbsolutePath());
		
		// 디렉토리의 파일 및 디렉토리 정보
		File temp = new File("C:\\Temp");
		
		File[] temps = temp.listFiles();
		System.out.println(temps.length);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		for(File f : temps) {
			// 폴더나 파일의 마지막 수정 시간 - 1000/1 밀리세컨으로 제공
			long modified = f.lastModified();
			String lastModified = sdf.format(modified);
			System.out.print(lastModified+"\t");
			// 해당되는 File이 디렉토리인지 확인
			boolean isDirectory = f.isDirectory();
			System.out.print(isDirectory ? "<DIR>" : "<FILE>");
			System.out.print("\t");
			// file or 디렉토리 명
			String name = f.getName();
			System.out.print(name+"\t");
			// 쓰기 가능한 파일또는 디렉토리 인지 여부
			boolean isWrite = f.canWrite();
			System.out.println(isWrite);
		}
		
		
		path = "C:\\Temp\\dir";
		File file4 = new File(path);
		// 지정된 디렉토리나 파일 삭제
		boolean isDeleted = file4.delete();
		System.out.println("디렉토리 삭제 여부 : " + isDeleted);
		
		File file5 = new File(path,"file.txt");
		isDeleted = file5.delete();
		System.out.println("파일 삭제 여부 : " + isDeleted);
		
		File file6 = new File(path);
		isDeleted = file6.delete();
		System.out.println("디렉토리 삭제 여부 : " + isDeleted);
		
	}

}























