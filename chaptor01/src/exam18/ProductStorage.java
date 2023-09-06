package exam18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {
	private	Scanner sc = new Scanner(System.in); //scanner로 입력받기
	private List<Product> list = new ArrayList<>(); //list를 생성
	private int counter; //pno를 제공할 변수
	
	public void showMenu() {
		
		while(true) {
		
		System.out.println("------------------------");
		System.out.println("1. 등록 | 2. 목록 | 3. 종료");
		System.out.println("------------------------");
		
		System.out.print("선택 : ");
		String select = sc.nextLine(); //번호를 받아서 읽는다.
		switch(select) {
		case "1" : registerProduct(); break; //product를 등록한다
		case "2" : showProducts(); break; // 등록된 모든 product의 정보를 보기
		case "3" : return; //프로그램 종료
		}
		}
	}

	private void registerProduct() {
		try {
			
			Product product = new Product();
			product.setPno(++counter); //pno를 세팅한다.
			
			System.out.print("상품명 : ");
//		String name = sc.nextLine();
//		product.setName(name);
			product.setName(sc.nextLine()); //위의 두줄을 한줄로 축약
			
			System.out.print("가격 : ");
			String price = sc.nextLine();
			product.setPrice(Integer.parseInt(price));
//		product.setPrice(Integer.parseInt(sc.nextLine())); 위의 두줄 한줄로 축약	
			
			System.out.print("재고 : ");
			String stock = sc.nextLine();
			product.setStock(Integer.parseInt(stock));
//		product.setStock(Integer.parseInt(sc.nextLine())); 위의 두줄을 한줄로 축약
			
			list.add(product);
			
		}catch(Exception e){
			System.out.println("등록 에러 : "+e.getMessage());
		}
	}

	private void showProducts() {
		for(Product p : list) {
//			System.out.println(p.getPno()+"\t"+p.getName()+"\t"
//					          +p.getPrice()+"\t"+p.getStock());
//		} 
		//이렇게 만들어서 보여주기
//		toString을 써서 보여주기
			System.out.println(p);
			
		}
	}
}
