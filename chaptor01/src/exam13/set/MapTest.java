package exam13.set;

import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> fruits = 
	Map.of("딸기", 5, "수박", 2, "바나나", 7, "멜론", 3, "오렌지", 10);
		System.out.println(fruits.size()+"종류의 과일이 있습니다.");
		System.out.println(fruits);
		for(String key : fruits.keySet()) {
			System.out.println(key + "가 "+fruits.get(key)+"개 있습니다.");
		}
		
		String key = "오렌지";
		if(fruits.containsKey(key)) {
			
			System.out.println(key+" : "+fruits.get(key));
		}
	}
}
