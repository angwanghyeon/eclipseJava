package exam05.ex02;

//ctrl+shift+O
import exam05.hankook.SnowTire;
import exam05.hyndai.Engine;
import exam05.kumho.BigWireTire;
import exam05.hankook.Tire;

public class Car {
	public static void main(String[] args) {
		
	Engine engine = new Engine();
	engine.engineType();
	int a = engine.a;
	SnowTire snowTire = new SnowTire();
	BigWireTire bwt = new BigWireTire();
	Tire tire = new Tire();
	
	//int count1 = tire.count(); <-이거는 private라서 외부에서 접근 불가능
	int count = tire.getCount();
	tire.setCount(5);
	System.out.println(tire.getCount());
	exam05.kumho.Tire tire2 = new exam05.kumho.Tire();
	}

}
