package exam05;



public class Factory {
	
	private static Factory f = new Factory();
	//public static String x = f.toString();
	private Factory() {
		
	}
	
	public static Factory getInstance() {
		return f;
	}
	
	public Product createProduct() {
		return new Product();
	}

	//public static String getString() {

		//return x;
	//}
	

}
