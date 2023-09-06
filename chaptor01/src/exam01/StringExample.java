package exam01;

public class StringExample {

	public static void main(String[] args) {
		char var01 = 'A';
		char var02 = 65;
		char var03 = '\u0041';
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);

		String name = "\"홍길동\"";
		String job = "프로그래머";
		//String a01 = 'a';
		System.out.println(name);
		System.out.println(job);
		
		float var04 = 3.14f;
		double var05 = 3.14;
		int var06 = 30;
		
		var04 = var01;
		System.out.println(var04);
		
		var05 = var01;
		System.out.println(var05);
		
		var06 = var01;
		System.out.println(var06);
		
		byte var07 = 65;
		System.out.println(var07);
		
		//var01 = var07;
		
		//casting
		var07 = (byte)var06; //int -> byte로 casting
		
		//int(4byte) -> char(2byte)
		var01 = (char)var06;
		
		
		//double->int
		var05 = 3.141592;
		System.out.println(var05);
		var06=(int)var05;
		System.out.println(var01);
		System.out.println(var06);
	}

}
