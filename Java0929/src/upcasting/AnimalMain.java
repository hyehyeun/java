package upcasting;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println(dog.leg);
		dog.bark();
		
		Animal animal = dog; //��ĳ����!! -->����Ŭ������ Ÿ���� ����Ŭ����Ÿ������ �ٲپ� �ִ°�!!
		
		animal.bark();
		cry(dog);
		cry(cat);
//	System.out.println(animal.color);

	}
	public static void cry(Animal animal) {
		animal.bark();
	}

}