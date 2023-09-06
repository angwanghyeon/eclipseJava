package practice.ex08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class DoubleTxtTest {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/double.txt");
		DataOutputStream dos = new DataOutputStream(os);
		double[] db = {1, 2.5, 3.5, 5.8, 10.2};
		for(Double d : db) {
			dos.writeDouble(d);
		}
		dos.close();
		InputStream is = new FileInputStream("C:/Temp/double.txt");
		DataInputStream dis = new DataInputStream(is);
		
		for(int i=0; i<db.length; i++) {
			System.out.println(dis.readDouble());
		}
		
	}
}
