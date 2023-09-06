package exam08;

public class OvershadowTest {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child c = new Child();
		
		p.print();
		
		c.print();

	}
}
