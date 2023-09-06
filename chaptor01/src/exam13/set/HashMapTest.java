package exam13.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("이주헌", 90);
		map.put("박종윤", 80);
		map.put("황덕연", 75);
		map.put("임형철", 68);
		map.put("김수빈", 70);
		
		System.out.println(map.size());
		System.out.println("이주헌 : "+map.get("이주헌"));
		
		Set<String> ks = map.keySet();
		Iterator<String> ki = ks.iterator();
		while(ki.hasNext()) {
			String k = ki.next();
			Integer value = map.get(k);
			System.out.println("Key : "+k+", value : "+value);
		}
		
		map.remove("김수빈");
		System.out.println(map.size());
		
		Set<Map.Entry<String, Integer>> es = map.entrySet();
		Iterator<Map.Entry<String, Integer>> ei = es.iterator();
		while(ei.hasNext()) {
			Map.Entry<String, Integer> entry = ei.next();
			String key = entry.getKey();
			Integer integer = entry.getValue();
			System.out.println("Key : "+key+", value : "+integer);
		}
		
		map.clear();
		System.out.println(map.size());
	}
}
