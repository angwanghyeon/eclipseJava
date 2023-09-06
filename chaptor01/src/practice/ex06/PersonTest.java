package practice.ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PersonTest {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();

		set.add(new Person("홍길동",30));
		set.add(new Person("안광현",25));
		set.add(new Person("홍길동",30));
		
		Iterator<Person> i = set.iterator();
		while(i.hasNext()) {
			Person p = i.next();
			System.out.println(p);
		}
	}
}
