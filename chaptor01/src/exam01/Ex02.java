package exam01;

public class Ex02 {

	public static void main(String[] args) {
		int var01 = 20;
		
		if (var01>10) {
			int var02 = 0; //var02는 if문 안에서만 사용가능
			var02 += var01;
			System.out.println("var02+=var01:"+var02);
		}
		
		for(int i = 0; i<=10; i++) {
			int var03 = i; //선언
			var01 += var03;
			System.out.println(i+" "+var01);
		}
		
        System.out.println(var01);
	}

}
