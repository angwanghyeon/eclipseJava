package exam02;

public class ArrayCreateByValueList {
	public static void main(String[] args) {// 보이드는 리턴값이 없어도 댐
		
          int[] scores = {10,20,30};
          int sum = add(scores);
          System.out.println(sum);
          scores = new int[] {1,2,3};
          sum = add(scores);
          System.out.println(sum);
	}

	public static int add(int[] scores) {// int는 int값의 리턴이 필요함, int값을 리턴할 add라는 int 함수를 가지는 method 생성

		//기본적인 for문
		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
		
		
		//향상된 for문
		for(int a : scores) {
			sum += a;
		}
		return sum;

	}
}
