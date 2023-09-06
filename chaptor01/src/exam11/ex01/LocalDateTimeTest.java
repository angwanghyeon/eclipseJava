package exam11.ex01;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

import exam09.ex01.Local;

public class LocalDateTimeTest {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		LocalDateTime mt = dt.plusHours(22);
		mt = mt.minusMinutes(20);

		System.out.println(mt);

		LocalDateTime today = LocalDateTime.of(2023, 07, 10, 11, 20, 30);
		System.out.println(today);

		LocalDateTime flight1 = LocalDateTime.of(2023, 07, 15, 10, 15);
		LocalDateTime flight2 = LocalDateTime.of(2023, 07, 25, 12, 25);
		
		// 빠른 항공권을 선택
		
		LocalDateTime myFlight;
		if(flight1.isBefore(flight2)) {
			myFlight = flight1;
		}else {
			myFlight = flight2;
		}
		
		//빠른 항공편의 비행 탑승 시간까지 남은 시간을 계산
		//날짜 계산의 Period
		Period dayLeft = Period.between(today.toLocalDate(), myFlight.toLocalDate());
		//시간 계산의 Duration
		Duration timeLeft = Duration.between(today.toLocalTime(), myFlight.toLocalTime());
		System.out.println(dayLeft.getDays()+"일");
		System.out.println(timeLeft);
	}
}
