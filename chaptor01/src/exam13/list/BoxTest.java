package exam13.list;

public class BoxTest {
	public static void main(String[] args) {
		Box<Apple> ab = new Box();
		Box<Orange> ob = new Box();
		
		ab.setObj(new Apple());
		ob.setObj(new Orange());
		
		Apple apple = ab.getObj();
		Orange orange = ob.getObj();
		
		System.out.println(apple);
		System.out.println(orange);
		
//		ab.setObj("Apple"); //컴파일 상에는 오류가 뜨지 않음 -> String도 obj니까
//		ob.setObj("Orange"); //제네릭을 쓴 이후에는 컴파일 상에 오류가 발생
//		
//		Apple apple = (Apple) ab.getObj();
//		Orange orange = (Orange) ob.getObj();
//		
//		System.out.println(apple);
//		System.out.println(orange);
	}
}
