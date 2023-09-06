package practice.java13_1;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return (s.studentNum == studentNum);
		}
			return false;
	}
	
	@Override
	public int hashCode() {
		
		return studentNum;
	}
}
