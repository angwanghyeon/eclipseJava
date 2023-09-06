package exam13.set;

import java.util.HashMap;
import java.util.Map;

public class StudentTest {
	public static void main(String[] args) {
		Map<Student, Integer> student = new HashMap();
		student.put(new Student("이주헌",1), 40);
		student.put(new Student("이주헌",1), 40);
		student.put(new Student("박종윤",2), 37);
		
		System.out.println(student.size());
		
		
		
	}
}
