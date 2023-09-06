package exam01;

public class Ex01 {
	
	public static void a01() {
		b01();
		String v01 = "a01()입니다.";
		System.out.println(v01);
	}

	public static void b01() {
		int v01 = 100;
		System.out.println("b01()입니다");
		System.out.println("v01은 "+ v01+ "입니다");
	}
	public static void main(String[] args) {
		//Ex01 ex01 = new Ex01(); static하지 않은 애들은 이렇게 new 써서 불러야함
		System.out.println("hello world~");
		int x;
		x = 150;
		int y = 200;
		int result = x+y;
		
		System.out.println("x+y = " + result);
		System.out.println(x+"+"+y+"=" +result);
		
		//ex01.a01();//static하지 않을때는 이렇게 변형해서 쓴다.
		a01();//같은 클래스 안에 있으니까 굳이 클래스명을 앞에 쓸 필요가 없음
		System.out.println("main 메소드 입니다.");
		
		
		//a01에서 선언된 변수는 사용할 수 없다
		//System.out.println(v01);
	}

}
