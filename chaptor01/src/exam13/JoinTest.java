package exam13;

public class JoinTest {
	public static void main(String[] args) {
		JoinThread jt = new JoinThread();
		jt.start();
		
		try {
			jt.join(); //join도 exception이 발생하기때문에 try-catch해줘야함
			System.out.println("스레드가 끝날때까지 대기하세요");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//jt의 run이 메인 스레드보다 더 늦게 끝나기때문에 join을 사용해줘야함
		
		System.out.println("총합 : "+jt.total);
	}
}
