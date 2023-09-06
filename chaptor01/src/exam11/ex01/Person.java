package exam11.ex01;

public class Person implements Comparable<Person>{

	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {

		return "[" + name + ": " + age + "]";
	}

	@Override
	public int compareTo(Person o) {
//		if(this.age>o.age) {
//			return 1;
//		}else if(this.age<o.age) {
//			return -1;
//		}else {
//			return 0;
//		}
		//위의 개념은 나이를 오름차순으로 정렬
		
		//return this.age - o.age;
		//위의 개념도 나이를 오름차순으로 정렬한것
		
//		if(this.name.length() > o.name.length()) {
//			return 1;
//		}else if(this.name.length()<o.name.length()) {
//			return -1;
//		}else { 
//			return 0;
//		}
//		
//	}		
		//위의 개념은 이름의 길이를 오름차순으로 정렬
	return this.name.compareTo(o.name);
		//위의 개념은 이름의 크기를 오름차순으로 정렬
	}
}
