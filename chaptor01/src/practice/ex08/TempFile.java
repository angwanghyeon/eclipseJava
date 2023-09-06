package practice.ex08;

import java.io.File;
import java.io.IOException;

public class TempFile {
	public static void main(String[] args) throws Exception {
		File file = new File("C:/Temp/file.txt");
		if(file.exists() == false) {
			file.createNewFile();
			System.out.println("파일이 없으므로 생성합니다.");
		}else {
			System.out.println("파일이 존재하므로 넘어갑니다.");
		}
	}
}
