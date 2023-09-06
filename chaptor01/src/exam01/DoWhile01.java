package exam01;

public class DoWhile01 {

	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println("like java"+i);
			i++;
		}while(i<10);

		//i=0; 새로 초기화
		while(i<10) {
			System.out.println("like java"+i);
			i++;
		}//이렇게 하면 i가 10 이상이기에 밑에 while문은 돌아가지 않음 
		//따라서 값을 초기화 하거나 i 범위를 새로 설정해야함
	}

}
