package exam11.ex01;

import java.time.Duration;
import java.time.Instant;

public class InstantTest {
	public static void main(String[] args) {
		Instant start = Instant.now(); //현재 시각을 start라는 변수에 대입
		System.out.println("시작 시간 : "+start.getEpochSecond());
		System.out.println("Time is running out");
		int sum = 0;
		
		for(int i=0; i<1000000; i++) {
			sum += i;
		}
		
		Instant end = Instant.now();
		System.out.println("종료 시간 : "+end.getEpochSecond()); //한번더 
		
		Duration between = Duration.between(start, end); //시간의 차이를 구해주는 메소드 Duration
		System.out.println("밀리 초 단위의 시간 차이는 : "+between.toMillis());
	}
}
