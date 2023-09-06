package exam14.lambda;

@FunctionalInterface
interface Negative{int neg(int x);};

@FunctionalInterface
interface Printable{void print();}

public class LambdaTest {
	public static void main(String[] args) {
		Negative n;
		Printable p;
		
//		n= new Negative() {
//			
//			@Override
//			public int neg(int x) {
//				
//				return -x;
//			}
//		}; //단순 익명 객체로 생성
	//	n = (int x) -> {return -x;}; 람다식으로 생성 
	//	n = (x) -> -x; 리턴문 빼기
		n= x -> -x;
		
//		p = new Printable() {
//			
//			@Override
//			public void print() {
//				System.out.println("Hello");
//			}
//		};
		p = () -> System.out.println("Hello");
		
		//s -> Integer.paseInt(s,);
	}
}
