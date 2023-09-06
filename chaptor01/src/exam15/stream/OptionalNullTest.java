package exam15.stream;

import java.util.Optional;

public class OptionalNullTest {
	public static void main(String[] args) {
		String s1 = "안녕!";
//		String s1 = "";
//		String s1 = null;
		Optional<String> o = Optional.ofNullable(s1);
		
		if(s1 != null) {
			Util.print(s1);
		}else {
			Util.print("없음");
		}
		System.out.println();
		
		
		if(o.isPresent()) { //isPresent 메소드는 값의 존재 여부를 묻는다
			Util.print(o.get());
		}else {
			Util.print("없음");
		}
		System.out.println();
		
		
		String s2 = o.orElse("없음"); //orElse는 값이 있다면 그대로 출력 없다면 매개값을 출력
		Util.print(s2);
		
		System.out.println();
		o.ifPresentOrElse(Util::print, ()->System.out.println("없음"));
		//ifPresentOfElse는 값의 존재 여부를 묻고 없다면 람다식 대로 진행
		
	}
}
