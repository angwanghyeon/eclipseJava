package practice.ex06;

import java.util.HashMap;
import java.util.Map;

public class HashMapAnimal {
	public static void main(String[] args) {
		Map<String, String> animal = new HashMap<>();

		animal.put("호랑이", "tiger");
		animal.put("표범", "leopard");
		animal.put("사자", "lion");
		
		System.out.println("변경 전 : "+animal);
		
		
//		animal.replaceAll(new Bifunction<String, String, String>(){
//		@Override
//		public String apply(String key, String value){
//		value = value.toUpperCase();
//		return value;
// 		위에꺼는 replaceAll의 기본골자임
		
		animal.replaceAll((key,value)->value.toUpperCase()); //람다식
		System.out.println("변경 후 : "+animal);
		
	}
}
