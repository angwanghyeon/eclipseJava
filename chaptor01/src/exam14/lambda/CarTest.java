package exam14.lambda;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
	public static void main(String[] args) {
		
		List<Car> diselCars = findCars(Car.car, c->!c.isGasoline());
		System.out.println("디젤 자동차는 : "+diselCars);
		
		List<Car> oldCars = findCars(Car.car, c -> c.getAge()>=10);
		System.out.println("연식이 10년 이상이 된 자동차는 : "+oldCars);
		
		List<Car> oldDiselCars = findCars(diselCars, c -> c.getAge()>=10);
//		List<Car> oldDiselCars = findCars(Car.car, c -> c.getAge()>=10 && !c.isGasoline());
		System.out.println("연식이 10년 이상된 디젤 자동차는 : "+oldDiselCars);
		
		System.out.print("디젤 자동차 = ");
		printCars(diselCars, c -> System.out.print(c.getModel()+" : "+c.getAge()+", "));
	
		System.out.println("\n 10년 이상된 자동차 : ");
		printCars(oldCars, c-> System.out.println(c.getModel()+" "+c.getAge()+" "+c.getMileage()));
	} //c->해서 구현하는것이 람다식임

	public static List<Car> findCars(List<Car> all, CarPredicate cp) {
		List<Car> result = new ArrayList<>();
		for (Car c : all) {
			if (cp.test(c)) {
				result.add(c);
			}
		}
		return result;
	}
	public static void printCars(List<Car> all, CarConsumer cc) {
		for(Car c : all) {
			cc.accept(c);
		}
	}
	
}
