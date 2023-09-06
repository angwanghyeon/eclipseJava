package exam13.set;

import java.util.Objects;

public class Student {
	private String name;
	private int num;
	
	
	public Student(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return (s.num == num) && (s.name.equals(name));
		}
		return false;
	}
	
	@Override
	public int hashCode() {
//		return num + name.hashCode();
		return Objects.hash(name,num);
	}
}
