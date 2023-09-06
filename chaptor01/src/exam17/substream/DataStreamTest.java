package exam17.substream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamTest {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("C:/Temp/primitive.db");
				// 파일 출력 스트림을 받는다
		DataOutputStream dos = new DataOutputStream(fos);
		//data 보조스트림 연결
		
		dos.writeUTF("이주헌");
		dos.writeDouble(95.2);
		dos.writeInt(1);
		//값을 입력한다.
		
		dos.writeUTF("박종윤");
		dos.writeDouble(90.8);
		dos.writeInt(2);
		//값을 입력한다.
		
//		dos.flush(); 플러쉬는 close가 자동으로 해줌
		dos.close();//스트림 종료
		
		FileInputStream fis = 
				new FileInputStream("C:/Temp/primitive.db");
		//위 파일에서 입력 스트림
		DataInputStream dis = new DataInputStream(fis);
		//data 보조 스트림 연결
		
		for(int i=0; i<2; i++) { //2번 반복
			String name = dis.readUTF(); //
			double d = dis.readDouble();
			int a = dis.readInt();
			System.out.println(name+" : "+d+" : "+a);
			
		}

		dis.close();
	}
}
