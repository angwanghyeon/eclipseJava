package javaExam05;

public class Hotel {
	Room[] rooms = new Room[10];

	private static class Room {

		private int num;
		private String name;

		Room(int num, String name) {
			this.name = name;
			this.num = num;
		}

	}

	void add(int num, String name) {
		if (num > 0 && num < 11 && rooms[num - 1] == null) {
			rooms[num - 1] = new Room(num, name);
		}else if(num<0 && num>=11){
			System.out.println("그런 방은 없습니다.");
		}else if(rooms[num-1]!=null){
			System.out.println(num+"번 방은 사람이 있습니다.");
		}

	}

	void show() {
		for (int i = 0; i < rooms.length; i++)
			if (rooms[i] != null) {
				System.out.println(rooms[i].num + "번 방을 " +rooms[i].name + "가 예약했습니다.");
			}
	}

}
