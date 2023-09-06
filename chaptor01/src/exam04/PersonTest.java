package exam04;

import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
		System.out.print("이름을 입력하세요 : ");
		String sc1 = sc.nextLine();
		System.out.print("주민번호를 입력하세요 : ");
		String sc2 = sc.nextLine();
		System.out.print("여권번호를 입력하세요 : ");
		String sc3 = sc.nextLine();
		
		
		Person p1 = new Person(sc1,sc2,sc3);
		//Person p2 = new Person("이주헌","8400612-1545234","18254");
		p1.showInfo();
		//p2.showInfo();
		}
	}
}
