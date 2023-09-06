package exam10;

public class AnonymousLocal {
	
	private int field;
	
	public void method(int arg1, int arg2){
		int var1 = 0;
		int var2 = 0;
		
		field = 100;
		
		//var1 = 20; final한 변수이므로 값의 변경이 안댐
		//arg1 = 20; 마찬가지로 final함
		
		
		Calculatable c = new Calculatable() {
			
			@Override
			public int sum() {
				int result = field+arg1+arg2+var1+var2;
				return result;
			}
		};
		
		System.out.println(c.sum());
	}
}
