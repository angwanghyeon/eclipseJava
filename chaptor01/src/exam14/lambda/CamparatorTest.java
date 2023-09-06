package exam14.lambda;

import java.util.Arrays;
import java.util.Comparator;


public class CamparatorTest {
	public static void main(String[] args) {
		String[] s = { "로마의 가면 로마법을 따르라.",
				"시간은 금이다.", "펜은 칼보다 강하다." };
//		Arrays.sort(s, new Comparator<String>(){
//
//			@Override
//			public int compare(String o1, String o2) {
//				
//				return o1.length()-o2.length();
//			}
//			
//		}); //이렇게 하는건 기본적인 Arrays.sort를 할때 문법
		
		Arrays.sort(s,
				(s1, s2) ->  
		 s1.length()-s2.length());
		
		//comparator는 함수형 인터페이스 이기 때문에 람다식으로 전환이 가능
		//return문이 있을때는 중괄호로 감싸기
		
		for(String str : s) {
			System.out.println(str);
		}
	}
}
