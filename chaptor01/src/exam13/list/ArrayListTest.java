package exam13.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("DataBase");
		list.add("HTML");
		list.add(2,"JSP/Servlet"); //얘가 2번지로 들어가고 2번지에 있던애가 뒤로 밀려남
		list.add("React");
		
		System.out.println(list.size());
		System.out.println();
		
		System.out.println(list.get(2));
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println( );
		
		list.remove(2);
		list.remove(2);
		list.remove("HTML");
		
		for(String str : list) {
			System.out.println(str);
		}
		
	}
}
