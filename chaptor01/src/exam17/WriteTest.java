package exam17;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteTest {
	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		OutputStream os2 = new FileOutputStream("C:/Temp/test2.db");
		OutputStream os3 = new FileOutputStream("C:/Temp/test3.db");
		
		int a = 10;
		byte b = 20;
		byte c = 30;
		
		byte[] array = {10,20,30};
		
		byte[] array2 = {10,20,30,40,50};
		
		os.write(a);
		os.write(b);
		os.write(c);
		os2.write(array);
		os3.write(array2, 1, 3);
		
		os.flush();
		os.close();
		os2.flush();
		os2.close();
		os3.flush();
		os3.close();
	}
}
