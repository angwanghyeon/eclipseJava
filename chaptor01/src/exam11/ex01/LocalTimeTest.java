package exam11.ex01;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeTest {
	public static void main(String[] args) {
		
		LocalTime now = LocalTime.now();
		System.out.println("현재 시각은 : "+now);
		
		LocalTime mt = now.plusHours(2);
		mt = mt.plusMinutes(30); //30분 더해준걸 mt에 다시 입력
		
		System.out.println("미팅 시간은 : "+mt);
		
		LocalTime start = LocalTime.of(14, 24, 35);
		System.out.println("노래방 이용 시작 시간 : "+start);
		
		LocalTime end = LocalTime.of(15, 10, 52);
		System.out.println("노래방 이용 종료 시간 : "+end);
		
		Duration between = Duration.between(start, end);
		System.out.println("총 이용 시간은 : "+between);
		
		
	}
}
