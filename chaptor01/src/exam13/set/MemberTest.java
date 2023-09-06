package exam13.set;

import java.util.HashSet;
import java.util.Set;

public class MemberTest {
	public static void main(String[] args) {
		Set<Member> sm = new HashSet<>();
		
		sm.add(new Member("이주헌",38));
		sm.add(new Member("이주헌",38)); //hash코드와 equals를 수정 안하면 똑같은 객체라고 생각 안함
		
		System.out.println(sm.size());
	}
}
