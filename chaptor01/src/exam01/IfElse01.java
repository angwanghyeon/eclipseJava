package exam01;

public class IfElse01 {
	public static void main(String[] args) {
		int n = 24;
		
		switch(n/10) {
		case 0: 
			System.out.println("n은 0이상 10미만");
			break;
		case 1:  
			System.out.println("n은 10이상 20미만");
			break;
		case 2:
			System.out.println("n은 20이상 30미만");
			break;
		default:
			System.out.println("음수 혹은 30 이상");
	}
}
}
