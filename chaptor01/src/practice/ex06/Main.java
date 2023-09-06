package practice.ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String[] s = {"독수리","고양이","강아지"};
		String[] s2 = {"개미", "개미"};
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(s)); //이렇게 만들면 중간에 변경불가능
		System.out.println(list);
		
		List<String> all = new ArrayList<>();
		Collections.addAll(all, s2);
		System.out.println("nCopies(nCopies) : "+all);
		
		Collections.fill(all, "벌");
		System.out.println("'벌'을 채운 후(fill) : "+all);
		
		Collections.addAll(all, s);
		System.out.println("리스트를 모두 추가한 후(addAll) : "+all);
		
		Collections.shuffle(all);
		System.out.println("리스트를 섞은 후(shuffle) : "+all);
		
		Collections.reverse(all);
		System.out.println("리스트를 역순으로 정렬한 후(reverse): "+all);
		
		System.out.println("리스트에서 최소(min) : "+Collections.min(all));
		System.out.println("리스트에서 최대(max) : "+Collections.max(all));
		System.out.println("리스트에서 '벌'의 빈도(frequency) : "+Collections.frequency(all, "벌"));
		
}
}
