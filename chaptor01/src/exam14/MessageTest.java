package exam14;

import java.util.*;

public class MessageTest {
	public static void main(String[] args) {
		
		Queue<Message> m = new LinkedList<>();
		
		m.offer(new Message("sendMail","홍길동"));
		m.offer(new Message("sendSMS", "이주헌"));
		m.offer(new Message("sendKakaoTalk", "박종윤"));
		
		while(!m.isEmpty()) {
			Message message = m.poll();
			switch(message.getCommand()) {
			case "sendMail" :
				System.out.println(message.getTo()+"님에게 메일을 보냅니다.");
				break;
			case "sendSMS" : 
				System.out.println(message.getTo()+"님에게 SMS를 보냅니다.");
				break;
			case "sendKakaoTalk" : 
				System.out.println(message.getTo()+"님에게 카카오톡을 보냅니다.");
				break;
			}
			// Queue는 입력 받은 순서대로 홍길동 이주헌 박종윤이 출력 된다.
		}
	}
}
