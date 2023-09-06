package exam10;

public class Button {
	
	OnClickListener listener;
	
	void setOnCilckListener(OnClickListener listener) {
		this.listener=listener;
	}
	
	void touch() {
		listener.onCilck();
	}
	
	static interface OnClickListener{
		void onCilck();
	}

}
