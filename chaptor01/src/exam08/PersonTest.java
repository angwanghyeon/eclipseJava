package exam08;

public class PersonTest {
	public static void main(String[] args) {
		
		
		
		Person[] p = new Person[3];
		p[0]= new Person("김자바","22");
		p[1] = new Student("이자바","23","100");
		p[2] = new ForeignStudent("강자바","25","200","대한민국"); 
		
		for(Person person : p) {
			
				person.show();
				System.out.println();
			
		
	}
	}
}
