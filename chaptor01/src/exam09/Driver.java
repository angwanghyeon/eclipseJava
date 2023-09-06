package exam09;

public class Driver {

	public void driver(Vehicle v) {
		/*
		 * v.run(); ((Bus)v).checkFare();
		 */

		if (v instanceof Bus) {
			((Bus) v).checkFare();
		}
		v.run();

	}

}
