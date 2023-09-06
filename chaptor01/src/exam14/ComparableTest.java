package exam14;

import java.util.Arrays;

public class ComparableTest {
	public static void main(String[] args) {
		Rectangle[] rs = {new Rectangle(3, 5)
		, new Rectangle(2, 10) ,new Rectangle(5, 5)		
		};
		Arrays.sort(rs);
		
		for(Rectangle r : rs) {
			System.out.println(r);
		}
	}
}
