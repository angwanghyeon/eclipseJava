package practice.ex07;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringListTest {
	public static void main(String[] args) {
		List<String> list = List.of("민국", "지우","하준","지우","하준","지우");
		Map<Object, Long> map = list.stream()
				.collect(Collectors.groupingBy(s->s, Collectors.counting()));
		System.out.println(map);
	}
}
