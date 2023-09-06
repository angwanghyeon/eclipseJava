package exam02;

public class EnumEx {
	public static void main(String[] args) {
		Gender gender = Gender.FEMALE;
		if(gender == Gender.MALE) {
			System.out.println(Gender.MALE+"는 병역의 의무가 있습니다");
		}else {
			System.out.println(Gender.FEMALE+"는 병역의 의무가 없습니다");
			
		}
		//위에서 선언한 변수 젠더는 젠더타입만 받을수 있다
		//if(gender == Direction.SOUTH) { 
			
		//}
		Direction di = Direction.NORTH;
		if(di == Direction.EAST) {
			System.out.println(Direction.EAST+"는 방향이 일치합니다.");
		}else {
			System.out.println(di+"는 방향이 일치하지 않습니다.");
		}

	}
	enum Gender {MALE,FEMALE}
	enum Direction{EAST,WEST,SOUTH,NORTH}	
	
}
