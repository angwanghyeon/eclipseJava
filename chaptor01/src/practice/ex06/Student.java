package practice.ex06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> student = new ArrayList<>();
		
		System.out.println("== 결과");
		do {
			System.out.print("점수를 입력하세요 : ");
			int input = sc.nextInt();
			if(input>0) {
				student.add(input);
			}else {
				System.out.println("음수이므로 입력을 종료합니다");
				break;
			}
			
		}while(true);
		System.out.println("학생들의 성적 : "+student);
		for(int i=0; i<student.size(); i++) {
			if(student.get(i)>=Collections.max(student)-10) {
			System.out.println((i+1)+"번 학생의 성적은 "+student.get(i)+"이며 A등급입니다.");
			}else if(student.get(i)<Collections.max(student)-10 
					&& student.get(i)>=Collections.max(student)-20) {
				System.out.println((i+1)+"번 학생의 성적은 "+student.get(i)+"이며 B등급입니다.");
			}else if(student.get(i)<Collections.max(student)-20 
					&& student.get(i)>=Collections.max(student)-30) {
				System.out.println((i+1)+"번 학생의 성적은 "+student.get(i)+"이며 C등급입니다.");
			}else if(student.get(i)<Collections.max(student)-30 
					&& student.get(i)>=Collections.max(student)-40) {
				System.out.println((i+1)+"번 학생의 성적은 "+student.get(i)+"이며 D등급입니다.");
			}else {
				System.out.println((i+1)+"번 학생은 "+student.get(i)+"점이므로 F등급입니다 재수강하세요");
			}
		}
	
		
	}
}
