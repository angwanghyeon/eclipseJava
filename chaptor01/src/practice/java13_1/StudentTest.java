package practice.java13_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1,"홍길동"));
		set.add(new Student(2,"신용권"));
		set.add(new Student(1,"조민우"));
		
		Iterator<Student> i = set.iterator();
		while(i.hasNext()) {
			Student student = i.next();
			System.out.println(student.studentNum + " : "+student.name);
		}
		
		
	}
}
