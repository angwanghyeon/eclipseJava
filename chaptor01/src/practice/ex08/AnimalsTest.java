package practice.ex08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class AnimalsTest {
	public static void main(String[] args) throws Exception {
		String[] animals = {"ant", "bat", "cat","dog"};
		FileOutputStream fos = new FileOutputStream("C:/Temp/animals.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("a : ant");
		
	}
}
