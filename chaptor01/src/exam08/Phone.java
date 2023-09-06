package exam08;

public class Phone {
	
	protected String owner;
	
	
	public Phone(String owner) {
		this.owner = owner;
	}


	void talk() {
		System.out.println(owner+"는 지금 통화중입니다.");
	}

}
