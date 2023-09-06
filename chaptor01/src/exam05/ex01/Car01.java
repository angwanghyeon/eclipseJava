package exam05.ex01;

public class Car01 {
	
		private static int serialNum = 10000;
		int CarNum;
		
		public Car01() {
			serialNum++;
			CarNum = serialNum;
		}
		public int getCarNum() {
			return CarNum;
		}
	}
