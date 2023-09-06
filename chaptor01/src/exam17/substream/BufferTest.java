package exam17.substream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferTest {
	public static void main(String[] args) throws Exception {
		String originalFilePath1 = 
				BufferTest.class.getResource("bg001.jpg").getPath();
		System.out.println(originalFilePath1);
		String targetFilePath1 = 
				"C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		// 입력 스트림에
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		// 출력 스트림에
		
		String originalFilePath2 = 
				BufferTest.class.getResource("bg001.jpg").getPath();
		String targetFilePath2 = 
				"C:/Temp/targetFile2.jpg";
		
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		//파일 입력 스트림 생성
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		//파일 출력 스트림 생성
		BufferedInputStream bi = new BufferedInputStream(fis2);
		// fis2에 버퍼 
		BufferedOutputStream bo = new BufferedOutputStream(fos2);
		// fos2에 버퍼
		long nonBufferTime = copy(fis, fos);
		System.out.println(nonBufferTime);
		
		long bufferTime = copy(bi, bo);
		System.out.println(bufferTime);
		
		fis.close();
		fos.close();
		fis2.close();
		fos2.close();
		bi.close();
		bo.close();
	}
//	static int data = -1;
	
	private static long copy(InputStream is, OutputStream io) throws IOException {
		long start = System.nanoTime(); //시스템의 시간 가져오기
		while(true) {
			int data = is.read(); //값 읽기
			if(data == -1) break;
			io.write(data); //값 넣어주기
		}
		io.flush(); //반드시 남아있는 잉여값을 소환해줘야함
		return (System.nanoTime() - start); //시작시간에서 end 빼기
		
		//아까는 버퍼 역할을 하는 배열을 생성했지만 지금은 버퍼스트림을 사용했다
	}


}
