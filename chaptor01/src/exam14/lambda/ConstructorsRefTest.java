package exam14.lambda;


interface NewObject<T> {
	T getObject(T o);
}

interface NewArray<T> {
	T[] getArray(int size);
}

public class ConstructorsRefTest {
	public static void main(String[] args) {
		
		NewObject<String> ns;
		NewArray<Integer> ni;
		
		//ns = x -> new String(x); //생성자를 만든것
		ns = String :: new;
		String str = ns.getObject("사과");
		System.out.println(str);
		
//		ni = x -> new Integer[x];
		ni = Integer[]:: new; //생성자 참조는 이런식으로 한다 필요한 타입에 :: new를 해주는거
		Integer[] array = ni.getArray(2);
		array[0] = 100;
		array[1] = 200;
		for(Integer a: array) {
			System.out.println(a);			
		}
		
	}
}
