package exam02;

public class JavaExamDoubleArry {
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];

		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "]=" + mathScores[i][j]);
			}
		}
		
		System.out.println();
		
		int[][] engScores = { { 95, 100 }, { 50, 90,66 }, { 80, 90,68,65 } };//개별 주소값을 주기 때문에 length로 주면 알아서 잘 돌아감

		for (int i = 0; i < engScores.length; i++) {
			for (int j = 0; j < engScores[i].length; j++) {
				System.out.println("engScores[" + i + "][" + j + "]=" + engScores[i][j]);
			}
		}
	}
}
