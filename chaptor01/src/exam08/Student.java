package exam08;

public class Student extends Person {
	
	String ssn;

	public Student(String name, String age, String ssn) {
		super(name, age);
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public void show() {
		super.show();
		System.out.print("학번 : "+ssn+" ");
	}
	
	

}
