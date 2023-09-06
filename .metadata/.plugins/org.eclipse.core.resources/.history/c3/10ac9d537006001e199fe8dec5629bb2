package exam17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadArrayTest {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test2.db");
		byte[] ss = new byte[100]; //새로운 바이트 타입의 배열 생성
		while(true) { //무한반복
			int a = is.read(ss); //배열의 길이 만큼 읽는다.
			if(a==-1) //배열을 다 받았을때
				break;
			for(int i=0; i<a; i++) { //배열의 길이까지
				System.out.println(ss[i]); //배열 출력
			}

		}
		
		is.close();
	}
}
