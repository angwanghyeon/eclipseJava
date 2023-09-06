package exam08;

public class ForeignStudent extends Student {
	
	String nation;

	public ForeignStudent(String name, String age, String ssn, String nation) {
		super(name, age, ssn);
		this.nation = nation;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@Override
	public void show() {
		super.show();
		System.out.print("국적 : "+nation);
	}
	
	

}
