package exam06.ex01;

public class Car {
	
	private static int carNum = 0 ;
	private String color;
	private static int redNum;
	
	public Car(String color) {
		carNum++;
		if(color.equals("red")) {
			redNum++;
		}

	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
	
	}
	
	void redCar() {
		System.out.println("전체 자동차의 갯수는 : "+carNum);
		System.out.print("빨간색 자동차의 갯수는 : "+redNum);
	
	}

}
