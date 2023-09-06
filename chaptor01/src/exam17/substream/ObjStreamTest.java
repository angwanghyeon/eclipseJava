package exam17.substream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjStreamTest {
	public static void main(String[] args) throws Exception {
		writeList();
		List<Board> list = readList();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Board b : list) {
			System.out.println(b.getBno() + "\t"
					+ b.getTitle() + "\t" // \t는 tap키의 의미
					+ b.getContent() + "\t" 
					+ b.getWriter() + "\t"
					+ sdf.format(b.getDate()));
		}
	}

	private static List<Board> readList() throws Exception {

		FileInputStream fis = new FileInputStream("C:/Temp/board.db");
		// board.db 를 읽어오겠다.
		ObjectInputStream ois = new ObjectInputStream(fis);
		// obj보조스트림을 사용한다.
		List<Board> list = (List<Board>) ois.readObject();
		// obj를 board 타입의 리스트화 해서 집어넣기
		return list;
	}

	private static void writeList() throws Exception {
		List<Board> list = new ArrayList<>();

		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));

		FileOutputStream fos = new FileOutputStream("C:/Temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(list);
		// obj를 입력함
		oos.flush();
		oos.close();
	}
}
