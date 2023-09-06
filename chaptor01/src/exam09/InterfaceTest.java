package exam09;

public class InterfaceTest {
	public static void main(String[] args) {
		
		InterfaceCImplements im = new InterfaceCImplements();
		InterfaceA ia = im;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = im;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = im;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
	
	

}
