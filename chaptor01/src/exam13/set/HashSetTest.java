package exam13.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("Java");
		s.add("JDBC");
		s.add("Servlet");
		s.add("JSP");
		s.add("Java");
		
		System.out.println(s.size());
		System.out.println();
		
		Iterator<String> i = s.iterator();
		while(i.hasNext()) {
			String e = i.next();
			System.out.println(e);
		}
		
		System.out.println();
		s.remove("JDBC");
		s.remove("JSP");
		
		System.out.println(s.size());
		System.out.println();
		i = s.iterator();
		for(String ele : s) {
			System.out.println(ele);
		}
		
		s.clear();
		if(s.isEmpty()) {
			System.out.println();
			System.out.println("Set가 비어있음");
		}
	}
}
