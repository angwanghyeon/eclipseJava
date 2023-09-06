package exam11.ex01;

import java.util.Arrays;

public class ArrayObjSortTest {
	public static void main(String[] args) {

		Person[] p1 = new Person[3];
		p1[0] = new Person("이주헌", 40);
		p1[1] = new Person("박종윤", 38);
		p1[2] = new Person("황덕연", 33);
		
		
		Arrays.sort(p1);
		
		//ClassException발동
		for(Person p : p1) {
			System.out.println(p);
		}
		
		int idx = Arrays.binarySearch(p1, new Person("박종윤",38));
		System.out.println(idx);
	}
}
