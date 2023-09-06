package practice.ex07;

import java.util.ArrayList;
import java.util.List;

import exam15.stream.Util;

public class animalTest {
	public static void main(String[] args) {
//		String[] s = { "갈매기", "나비", "다람쥐", "라마" };
		List<String> str = List.of("갈매기","나비","다람쥐","라마");

		str.stream().filter(x -> x.length()==2).forEach(Util::print);
	}
}
