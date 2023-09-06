package exam01;

import java.io.IOException;
import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) throws IOException {
		//int keyCode = System.in.read();//시스템 입력 장치로부터 한번 읽음
		//System.out.println(keyCode); //잘 안씀
		int i = 10;
		boolean result = (i==10);
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		boolean result1 = (inputData == "10");
		System.out.println(inputData);
		System.out.println(result1);
		boolean result2 = (inputData.equals("10"));
		System.out.println(result2);
		

	}

}
