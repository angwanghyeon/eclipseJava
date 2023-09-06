package exam09.ex01;

public class Button {

	OnClickListener ocl;

	void setOnClickListener(OnClickListener ocl) {
		this.ocl = ocl;
	}

	void touch() {
		ocl.OnClick();
	}

	static interface OnClickListener {
		void OnClick();
	}

}
