package exam02;

public class JavaExam04{
	public static void main(String[] args) {
		
		int[][] KrSc = new int[2][];
		KrSc[0] = new int [2];
		KrSc[1] = new int [3];
		for(int i =0; i<KrSc.length; i++) {
			for(int j=0; j<KrSc[i].length; j++) {
				System.out.println((KrSc[i][j]));
			}
		}

	}
}
