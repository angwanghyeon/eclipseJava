package exam07;

public class ChildTest {
	public static void main(String[] args) {
		
	Child c = new Child();
	Parent p = new Parent();
	Parent pc = new Child();
	Parent p2 = c;  //같은 객체를 공유한다.
					//이렇다고 하면 pc와 p2는 주소값은 다른데 부를수 있는 메소드랑 그에 맞는 결과값이 같음
	
	System.out.println(pc);
	System.out.println(p2);
	System.out.println(c);

	
	p.meth2();
	c.meth2();
	p2.meth2();
	pc.meth2();
	
	//c.meth3();

	
	}
}
