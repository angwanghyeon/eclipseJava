package practice.ex06;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
	public static void main(String[] args) {
		List<String> animal = new ArrayList<>();

		animal.add("갈매기");
		animal.add("나비");
		animal.add("다람쥐");
		animal.add("라마");
		
//		for(int i=0; i<animal.size(); i++) {
//			if(animal.get(i).length() == 2) {
//				System.out.println(animal.get(i));
//			}
//		}
		
		for(String s : animal) {
			if(s.length()==2) {
				System.out.println(s);				
			}
		}
	}
}
