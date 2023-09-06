package javaExam05;

import java.util.Arrays;
import java.util.Comparator;

public class BookTest {
	public static void main(String[] args) {
		Book[] books = new Book[3];
		
		books[0] = new Book(15000);
		books[1] = new Book(50000);
		books[2] = new Book(20000);
		
		System.out.println("정렬 전");
		for(int i=0; i<books.length; i++) {
			System.out.println("Book : "+books[i].price);	
		}
		
		Arrays.sort(books); //배열을 정렬
		
		System.out.println("정렬 후");
		for(int i=0; i<books.length; i++) {
			System.out.println("Book : "+books[i].price);	
		}
		
		
	}
}
