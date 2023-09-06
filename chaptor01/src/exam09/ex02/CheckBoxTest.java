package exam09.ex02;

public class CheckBoxTest {
	public static void main(String[] args) {
		
		CheckBox cb = new CheckBox();
		cb.setOnSelectListener(new BackgroundChangeListener());
		cb.select();

	}
}
