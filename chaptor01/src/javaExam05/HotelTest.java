package javaExam05;

public class HotelTest {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.add(3, "호동이");
		hotel.add(8, "종윤이");
		hotel.show();
		
		hotel.add(8, "준수");
	}
}
