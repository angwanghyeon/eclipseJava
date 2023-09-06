package exam04;

public class Car {
	//필드
	String company="벤츠";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	public Car(){	
		this("e클래스","검은색",150);//초기화
	}
	
	public Car(String model) {
//		this.model=model;
		this(model, "검은색",150);
	}
	
	public Car(String model, String color) {
//		this.model=model;
		//this(model);
		//this.color=color;
		this(model, color, 150);
	}
	
	public Car(String model,String color, int maxSpeed) {
		this.model=model;
		this.color=color;
//      this(model, color);
		
		this.maxSpeed=maxSpeed;
	}
	void pri(){
		System.out.println("company : "+company);
		System.out.println("model : "+model);
		System.out.println("color : "+color);
		System.out.println("maxSpeed : "+maxSpeed+"km");
		System.out.println();
	}
	

}
