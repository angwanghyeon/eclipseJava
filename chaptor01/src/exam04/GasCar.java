package exam04;

public class GasCar {
	
	int gas;
	
	void segGas(int gas) {
		this.gas=gas;
		
	}
	
	boolean isLeftGas() {
		
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("현재 주행중 (gas잔량 : "+gas+")");
				gas -=1;
			}else {
				System.out.println("현재 주행 불가능(gas잔량 : "+gas+")");
				return;
			}
		}
	}

}
