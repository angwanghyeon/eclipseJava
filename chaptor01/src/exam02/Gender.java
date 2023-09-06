package exam02;

public enum Gender {
	
	
	MALE("남성"), FEMALE("여성");
	
	private String s; //s라는 스트링 변수 선언
	Gender/*생성자*/(String s){
		this.s = s;
	}
	public String toString() {/*메소드*/
		return s;
	}
}
