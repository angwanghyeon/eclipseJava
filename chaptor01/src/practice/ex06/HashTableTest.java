package practice.ex06;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashTableTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> map = new Hashtable<>();
		
		map.put("김열공", 80);
		map.put("최고봉", 90);
		map.put("우등생", 95);
		map.put("나자바", 88);
		
		do {
			System.out.print("이름을 입력해주세요 : ");
			String in = sc.nextLine();
			
		
		if(map.containsKey(in)) {
		System.out.println(in+"의 점수는 : "+map.get(in));
		}else if(in.equals("끝")) {
			System.out.println("입력을 종료합니다.");
			break;
		}
		else {
			System.out.println("이름을 잘못 입력하셨습니다");
			System.out.println("다시 이름을 입력해주세요");
		}
		}while(true);
//		Set<String> key = map.keySet();
//		Iterator<String> ki = key.iterator();
//		while(!ki.hasNext()) {
//			String k = ki.next();
//			Integer i = map.get(k);
//		if(in.equals(k)) {
//			System.out.println(k+"의 점수는 : "+map.get(k));
//			break;
//		}
//		
			}
		}
		
	

