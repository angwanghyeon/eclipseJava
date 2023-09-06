package exam08;

public class TelePhone extends Phone{
	
	private String when;
	
	public TelePhone(String owner) {
		super(owner);
	}
	
	public TelePhone(String owner, String when) {
		super(owner);
		this.when = when;
	}
	
	void autoAnswering() {
		System.out.println(owner+"는 부재중이니 "+when+" 다시 전화주세요.");
	}

}
