package exam11;

public class ResourcePathTest {
	public static void main(String[] args) {
		
		Class clazz = Key.class; //class key가 있는 곳을 기준으로 해서 가져온다
		
		String path1 = clazz.getResource("photo1.jpg").getPath();
		String path2 = clazz.getResource("images/photo2.jpg").getPath(); // 여기서 /를 사용하는 이유는 절대적과 상대적 구분을 하기 위함
		
		System.out.println(path1);
		System.out.println(path2);
	}
}
