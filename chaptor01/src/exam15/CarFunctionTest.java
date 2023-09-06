package exam15;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import exam14.lambda.Car;

public class CarFunctionTest {
	public static void main(String[] args) {
		Function<Car, String> f1 = c -> c.getModel();
		ToIntFunction<Car> f2 = c -> c.getAge();
		
		for(Car c : Car.car) {
			System.out.print("("+f1.apply(c)+", "
								+f2.applyAsInt(c)+")");
		}
		System.out.println();
		
		double averageAge = average(Car.car, c -> c.getAge());
		double avMileage = average(Car.car, c->c.getMileage());
		
		System.out.println("평균 연식 : "+averageAge);
		System.out.println("평균 주행거리 : "+avMileage);
	}

	private static double average(List<Car> car, ToIntFunction<Car> t) {
		double sum = 0.0;
		for(Car c : car) {
			sum += t.applyAsInt(c);
			
		}
		return sum / car.size();
	}
}
