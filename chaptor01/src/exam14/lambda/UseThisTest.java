package exam14.lambda;

import java.util.Comparator;

interface UseThis{void use();}

public class UseThisTest {
	public void lambda() {
		String hello = "Hello"; //지역변수
		
		UseThis u1 = new UseThis() { //익명객체생성
			
			@Override
			public void use() {
				System.out.println(this);
				System.out.println(hello);
//				hello = ""; hello는 로컬 변수라서 final임
			}
		};
		u1.use();
		//u2의 this는 toString을 불러옴
		UseThis u2 = () -> {System.out.println(this);//익명 객체를 람다로
			System.out.println(hello);
			//람다에서도 똑같이 로컬변수는 final이라 변경 불가능
		};
		u2.use(); 
	}
	
	public String toString() {
		return "UseThisTest";
	}
	
	public static void main(String[] args) {
		// int one =1;
		
		new UseThisTest().lambda(); //익명객체는 this를 찍으면 본인의 참조변수hash코드가 나옴
		
		Comparator<String> c=(one, two) -> one.length() - two.length();
		System.out.println(c);
	}
}
