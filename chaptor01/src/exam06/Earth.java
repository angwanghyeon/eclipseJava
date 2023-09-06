package exam06;

public class Earth {

	static final double EARTH_RADIUS = 64000;
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;

	public static void main(String[] args) {
		
		System.out.println("지구의 반지름 : "+EARTH_RADIUS+"km");
		System.out.println("지구의 면적은 : "+EARTH_AREA+"km^2");

	}

}
