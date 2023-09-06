package practice.ex07;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import exam15.stream.Util;

public class CapitalTest {
	public static void main(String[] args) {
		List<String> capital = List.of("서울","워싱턴","베이징","파리","마드리드","런던");

		System.out.println(capital.stream().sorted().findFirst().get());
	}
}
