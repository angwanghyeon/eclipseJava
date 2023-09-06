package exam14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CollectionsSortTest {
	public static void main(String[] args) {
		String[] fruits = {"딸기", "수박", "망고", "멜론", "샤인머스켓","패션후르츠","망고","수박"};
		List<String> list = Arrays.asList(fruits);
		System.out.println(list);
		Collections.sort(list);
		System.out.println("sort 이후 : "+list); //정렬
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("reverseOrder : "+list); //거꾸로
		
		Collections.reverse(list);
		System.out.println("reverse : "+list); //거꾸로
		
		Collections.rotate(list, 3); //맨 뒤에 있는 애가 앞으로 오는걸 3번하기
		System.out.println("rotate : "+list);
		
		Collections.shuffle(list);
		System.out.println("shuffle : "+list); //섞기
		
		Collections.sort(list);
		int i = Collections.binarySearch(list, "샤인머스켓");
		System.out.println(i); //검색
		
		HashSet<String> set = new HashSet<>(list);
		List<String> list2 = new ArrayList<>(set);
		System.out.println(list2); //중복되는 값이 존재할때 set으로 소거하기
		
		for(String fruit : list2) {
			System.out.println(fruit+" : "+Collections.frequency(list, fruit));
		}
	}
}
