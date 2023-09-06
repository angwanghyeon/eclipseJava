package exam01;

public class CastingExample {

	public static void main(String[] args) {
		byte x = 10;
		byte y = 20;
		int result = x+y;
		System.out.println(x + "+" + y + "=" +result);
		System.out.printf("%d + %d = %d\n", x, y,result);
		byte bResult = (byte)(x + y);
		System.out.println(bResult);
		
		int iValue = 10;
		double dValue = 3.14;
		
		double dResult = iValue + dValue;
		
		result = iValue + (int)dValue;
		
		System.out.println(dResult);
		System.out.println(result);
		
		dValue = 3.14 + 8.89;
		System.out.println(dValue);
		
		float fValue = 3.14f + 8.89f;
		System.out.println(fValue);
		
		int iX =1;
		int iY =2;
		//dResult = (double)iX/(double)iY;
		//dResult = (double)iX/iY;
		dResult = iX/(double)iY;
		System.out.println(dResult);
		
		String str = "3" + iX + iY;
		System.out.println(str);
		str = iX + "3" + iY;
		System.out.println(str);
		str = iX + iY + "3"; //서순이 굉장히 중요함
		System.out.println(str);
		
		str = "10";
		//str = "kim";
		//iX = int(str); //string은 class라서 변환 x
		//string -> int
		iX = Integer.parseInt(str);//Integer라는 class에 parseint라는 method에 string을 넣는다.
		System.out.println(iX);
		
		//string -> bytes
		x = Byte.parseByte(str);
		System.out.println(x);
		
		dValue = Double.parseDouble(str);
		System.out.println(dValue);
		
		//int -> string
		
		str = String.valueOf(iX);
		System.out.println(str);
		
		iX = -iX;
		System.out.println(iX);
		
		 bResult = (byte)-bResult;
		 int bResult2 = -bResult;
		 
		 
		 int result1 = ++iX + 10;
		 System.out.println("iX= "+ iX + " result= "+ result1);
		 
		 System.out.println(iY);
		 result1 = iY++ + 10;
		 System.out.println("iY= "+iY+" result= "+result1);
		 
		 String str01 = (iX>0) ? "iX는 양수입니다." : "iX는 0또는 음수입니다.";
		 System.out.println(str01);
		 
		//
		//int -> Integer
		//byte -> Byte
		
	}

}
