package exam11.ex01;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now(); //
		System.out.println(today);
		
		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25); 
		System.out.println(xmas);
		
		LocalDate eve = xmas.minusDays(1);
		System.out.println(eve);
		
		Period left = Period.between(today, xmas);
		System.out.println("오늘부터 크리스마스까지의 날짜는 : "+left.getMonths()+"달 "+left.getDays()+"일 남았습니다.");
		
		long totalDays = ChronoUnit.DAYS.between(today, xmas); //ChronoUnit을 사용하면 일로만 계산해서 출력가능
		long totalWeeks = ChronoUnit.WEEKS.between(today, xmas);
		System.out.println(totalDays);
		System.out.println(totalWeeks);
	}
}
