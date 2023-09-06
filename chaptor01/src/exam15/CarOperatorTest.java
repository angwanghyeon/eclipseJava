package exam15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

import exam14.lambda.Car;

public class CarOperatorTest {
	public static void main(String[] args) {
		Comparator<Integer> comp = (a, b) -> a-b; //오름차순이다.
		
		BinaryOperator<Integer> bo1 = BinaryOperator.maxBy(comp);
		System.out.println(bo1.apply(10, 5)); // Operator는 입력과 출력의 타입이 같다
		System.out.println(bo1.apply(10, 25));
		
		BinaryOperator<Integer> bo2	= BinaryOperator.minBy(comp);
		System.out.println(bo2.apply(10, 5));
		System.out.println(bo2.apply(10, 25));
		
		List<Car> list = remodeling(Car.car, c -> new Car("뉴"+c.getModel(), c.getAge(), 
				c.isGasoline(), c.getMileage()));
		System.out.println(list);
	}

	private static List<Car> remodeling(List<Car> car, UnaryOperator<Car> u) {
		ArrayList<Car> result = new ArrayList<>();
		for(Car c : car) {
//			result.add(c); 이렇게 하면 기존의 카 타입을 그냥 넣는거임
			result.add(u.apply(c)); //우리가 만들어둔 오퍼레이터를 사용하기 위해 이런식으로함
		}
		return result;
	}
}
