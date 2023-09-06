package exam02;

public class EnumEx02 {
	public static void main(String[] args) {
		Gender gender = Gender.FEMALE;
		
		if(gender == Gender.MALE) {
			System.out.println(Gender.MALE+"은 병역의 의무가 있다.");
		}else {
			System.out.println(Gender.FEMALE+"은 병역의 의무가 없다");	
		}
		
		for(Gender g : Gender.values()) {
			System.out.println(g.name());
		}
		
		System.out.println(Gender.valueOf("MALE")); //이런식으로 해주는게 보통 작업의 오류를 줄이기 위해
		System.out.println(Gender.valueOf("FEMALE"));

	}
}
