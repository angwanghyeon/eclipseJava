package exam13;

public class Dish {
	private boolean empty = true;
	
	public boolean isEmpty() {
		return empty; //empty 값을 리턴해주는
	}
	
	public void setEmpty(boolean empty) {
		this.empty=empty;
	}
}
