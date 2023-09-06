package exam04;

public class Person {
	
	String name;
	String code;
	String num;
	
	Person(){}
	
	public Person(String name,String code){
		this.name=name;
		this.code=code;
	}
	public Person(String name,String code,String num){
		this(name,code);
		this.num=num;
	}
	
	public void showInfo() {
		System.out.println("이름은 : "+name);
		System.out.println("주민번호는 : "+code);
		if(num.equals("")) {
			System.out.println("여권을 가지고 있지 않습니다.");
			
		}else {
			System.out.println("여권번호는 : "+num);
		}
		System.out.println();
	}
	

}
