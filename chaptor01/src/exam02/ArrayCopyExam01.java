package exam02;

public class ArrayCopyExam01 {
	public static void main(String[] args) {
		
		String[] oldArray = {"java","array","copy"};
		String[] newArray = new String[5];
		System.arraycopy(oldArray, 0, newArray, 1, 3);

		for(int i=0; i<newArray.length; i++) {
			System.out.print(newArray[i]+", ");
		}
		
		
	}
}
