package exam08.ex01;

public class AnimalTest {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.sound();
		c.sound();
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		animalSound(animal);
		animalSound(new Dog());
		animalSound(new Cat());
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
