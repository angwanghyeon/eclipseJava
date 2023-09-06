package exam17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ByteFileCopier {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("대상 파일 : ");
		String src = sc.nextLine();
		System.out.println();
		System.out.print("사본 이름 : ");
		String copi = sc.nextLine();
		
//		try(InputStream in =  new FileInputStream(src);
//				OutputStream out = new FileOutputStream(copi)){
//			//try resource 구문	자원을 알아서 닫아준다.
//			int data;
//			while(true) {
//				data = in.read(); //값을 하나하나 보내면 굉장히 오래걸린다.
//				if(data == -1)break;
//				out.write(data);
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		InputStream in =  new FileInputStream(src);
		OutputStream out = new FileOutputStream(copi);
		
		byte[] pic = new byte[1024]; //배열로써 보내면 시간이 최적화된다
		while(true) {
			int a = in.read(pic);
			if(a == -1) break;
			out.write(pic, 0, a);
		}
	}
}
