package exam11.ex01;

import java.util.Arrays;

class INum {
	private int num;

	INum(int num) {
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof INum) {
			INum i = (INum) obj;
			if (this.num == i.num) {
				return true;
			}
		}
		return false;

	}
}

public class ArrayEqualsTest {
	public static void main(String[] args) {
		INum[] ar1 = new INum[3];
		INum[] ar2 = new INum[3];

		for (int i = 0; i < 3; i++) {
			ar1[i] = new INum(i + 1);
			ar2[i] = new INum(i + 1);
		}

		System.out.println(Arrays.equals(ar1, ar2));
	}
}
