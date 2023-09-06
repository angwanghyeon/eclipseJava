package exam05;

public class FactoryTest {
	public static void main(String[] args) {
		
		Factory fc = Factory.getInstance();
		
		Product product1 = fc.createProduct();
		Product product2 = fc.createProduct();
		Product product3 = fc.createProduct();
		Product product4 = fc.createProduct();
		Product product5 = fc.createProduct();
		
		System.out.println(product1.getProduct());
		System.out.println(product2.getProduct());
		System.out.println(product3.getProduct());
		System.out.println(product4.getProduct());
		System.out.println(product5.getProduct());
		
		System.out.println(Factory.getInstance());
		System.out.println(product1);
		System.out.println(product5);
		//System.out.println(Factory.getString());
		

	}
}
