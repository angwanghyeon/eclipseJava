package exam17.substream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamTest {
	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다. 문자 변환 스트림을 사용합니다. 문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}

	private static String read() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/test6.txt");
		//파일을 입력하겠다
		Reader r = new InputStreamReader(fis); // 바이트 기반의 reader 입력 스트림
		char[] c = new char[50]; //크기가 50인 char 배열생성 ->파일이 배열 크기를 넘어가면 짤림
		int i = r.read(c); //값을 작성한다.
		System.out.println(i);
		r.close();
		String data = new String(c, 0, i); //캐릭터 배열을 스트링으로 만든다.
		return data;
	}

	private static void write(String string) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/test6.txt");
		// 파일을 출력하겠다
		Writer w = new OutputStreamWriter(fos);
		// 바이트 기반의 writer 출력 스트림
		w.write(string);//불러온 스트링 값을 넣어버리겠다
		w.close();
	}
}
