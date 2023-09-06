package exam09.ex02;

public class CheckBox {
	OnSelectListener osl;
	
	void setOnSelectListener(OnSelectListener osl) {
		this.osl=osl;
	}
	
	void select() {
		osl.Onselect();
	}
	
	static interface OnSelectListener{
		void Onselect();
	}
}
