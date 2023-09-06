package exam03;

public class BandMember {
	
	String name;
	String position;
	String 장르;
	int year;
	int age;
	int al;
	
	public BandMember(String name, String position, String 장르, int year, int age, int al) {
		super();
		this.name = name;
		this.position = position;
		this.장르 = 장르;
		this.year = year;
		this.age = age;
		this.al = al;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String get장르() {
		return 장르;
	}

	public void set장르(String 장르) {
		this.장르 = 장르;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAl() {
		return al;
	}

	public void setAl(int al) {
		this.al = al;
	}
	
	
	
	/*
	 * public BandMember(){}
	 * 
	 * public BandMember(String name,String position, int age,int year, int al,
	 * String 장르) { this.name = name; //this에서 나오는건 필드 뒤에는 매개변수 this.position =
	 * position; this.age = age; this.al = al; this.year=year; this.장르=장르; }
	 * 
	 * //BandMember(){} 이러한 생성자를 호출함(default)
	 * 
	 * void print() {
	 * System.out.println("이름은: "+name+" 역할은: "+position+" 나이는: "+age+"살"); } void
	 * print2() {
	 * System.out.println("선호장르 : "+장르+" 경력은: "+year+"년"+" 앨범은: "+al+"장");}
	 */
	
}
