package exam18;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Temp/images"); //directory를 생성
		File file1 = new File("C:/Temp/file1.txt"); //txt파일을 생성
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		File file4 = new File("C:/Temp/file4.txt");
		
		if(dir.exists()==false) {dir.mkdir();} //파일 또는 폴더가 존재하지 않으면 생성
		if(file1.exists()==false) {file1.createNewFile();} //exception이 날수 있음
		if(file2.exists()==false) {file2.createNewFile();}
		if(file3.exists()==false) {file3.createNewFile();}
		if(file4.exists()==false) {file4.createNewFile();}
		
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		//C:/Temp 폴더의 내용 목록을 File 타입의 배열로 얻는다.
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("----------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			//sdf의 format 을 부르는데 새롭게 date 설정을 하되 file의 마지막 변경 날짜를 불러온다.
			if(file.isDirectory()) { //파일의 형태가 폴더이면
				System.out.print("\t<DIR>\t\t\t"+file.getName()); //이름과 형태를 출력
			}else {
				System.out.print("\t\t\t"+file.length()+"\t"
						+file.getName()); //폴더가 아니라면 크기와 이름을 출력
				
			}
			System.out.println();
			
			if(file.getName().equals("file1.txt")) {
				file.delete(); //파일의 이름이 다음과 같다면 파일을 삭제하라
			}
		}
		
	}
}
