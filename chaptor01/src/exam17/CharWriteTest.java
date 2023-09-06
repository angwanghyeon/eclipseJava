package exam17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharWriteTest {
	public static void main(String[] args) throws Exception {	
		Writer sw1 = new FileWriter("C:/Temp/test5.txt"); //String이니까 txt 파일로 만든다.
//		Writer sw2 = new FileWriter("C:/Temp/test6.txt"); //String이니까 txt 파일로 만든다.
		Reader sr = new FileReader("C:/Temp/test5.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		char[] array = {'A', 'B', 'C'};
		
		sw1.write(a);
		sw1.write(b);
		sw1.write(c);
		//char 값을 하나씩 넣었지만 더해져서 문자열이 된다
		sw1.write(array);
		//char의 배열을 넣었고
		sw1.write(array,1,2);
		//배열의 일부만 주기
		
		sw1.flush();
		sw1.close();
//		sw2.close();
		
		while(true) {
			int data = sr.read(); //똑같이 값을 받아서 넣어주고
			if(data == -1)
				break;
			System.out.print((char)data); //int로 받았으니까 char로 바뀌어서 
		}
		System.out.println();
		
		sr = new FileReader("C:/Temp/test5.txt"); //스트림을 한번 사용했으니까 다시 생성해야함
		char[] ca = new char[100];
		while(true) {
			int data = sr.read(ca,2,3);
			if(data==-1)
				break;
			for(int i=0; i<ca.length; i++) {
				System.out.print(ca[i]);
			}
		}
		sr.close();
	}
}
