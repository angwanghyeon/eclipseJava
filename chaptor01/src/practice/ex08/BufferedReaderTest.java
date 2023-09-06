package practice.ex08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderTest {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			System.out.print("입력하세요 : ");
			String str = br.readLine();
			if(str.equals("end") || str.equals("그만")) {
				break;
			}else {
				System.out.println("출력 : "+str);
			}
		}
		br.close();
	}
}