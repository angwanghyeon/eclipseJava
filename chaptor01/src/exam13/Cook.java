package exam13;

public class Cook implements Runnable {

	private Dish dish;

	public Cook(Dish dish) {
		this.dish = dish;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {

			try {
				cook(i);
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void cook(int i) {
		synchronized (dish) { //실행 블럭 전체 다 들어가있어서 사실 cook에 걸어도 됨
			while (!dish.isEmpty()) { // 접시가 비어있지 않을때
				try {
					dish.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			dish.setEmpty(false);
			System.out.println(i + "번째 음식이 준비 되었습니다.");
			dish.notify();
		}

	}
}
