package exam03;

public class KoreanTest {
	public static void main(String[] args) {
		
		Korean k1 = new Korean("안광현","25");
		Korean k2 = new Korean("홍길동","30");
		
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssd);
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssd);
		if(k1.equals(k2)) {
			System.out.println("k1과 k2는 같다");
		}else {
			System.out.println("k1과 k2는 다르다");
			System.out.println(k1);
			System.out.println(k2);
		}
		
		Korean k3 = new Korean();
		System.out.println(k3.nation);
		System.out.println(k3.name);
		System.out.println(k3.ssd);
		Korean k4 = new Korean();
		System.out.println(k4.nation);
		System.out.println(k4.name);
		System.out.println(k4.ssd);
		if(k3==k4) {
			System.out.println("k3과 k4는 같다");
		}else {
			System.out.println("k3과 k4는 다르다");
			System.out.println(k3);
			System.out.println(k4);
		}

	}
}
