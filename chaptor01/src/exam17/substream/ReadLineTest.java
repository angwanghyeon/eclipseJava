package exam17.substream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineTest {
	public static void main(String[] args) throws Exception {
		Reader r = new FileReader( //익명 객체를 생성한다.
		ReadLineTest.class.getResource("language.txt").getPath() //클래스의 리소스(string)의 경로를 가져온다.
		);
		BufferedReader br = new BufferedReader(r);
		//버퍼 스트림을 생성한다
		
		while(true) {
			String data = br.readLine(); //스트링 타입의 data에 입력 스트림의 값을 넣는다
			if(data == null) break; // 값이 전부 입력되었다는걸 확인
			System.out.println(data);
		}
		
		br.close();
	}
}
