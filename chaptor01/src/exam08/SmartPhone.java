package exam08;

public class SmartPhone extends TelePhone{
	
	private String game;

	public SmartPhone(String owner, String game) {
		super(owner);
		this.game = game;
	}
	
	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	void playGame() {
		System.out.println(owner+"은 현재"+game+"중입니다.");
	}

}
