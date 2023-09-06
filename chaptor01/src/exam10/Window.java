package exam10;

public class Window {
	
	Button b1 = new Button();
	Button b2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onCilck() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window() {
		b1.setOnCilckListener(listener);
		b2.setOnCilckListener(new Button.OnClickListener() {
			
			@Override
			public void onCilck() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}
