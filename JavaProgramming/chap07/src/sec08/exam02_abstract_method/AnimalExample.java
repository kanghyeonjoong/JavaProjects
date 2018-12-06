package sec08.exam02_abstract_method;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----------------------------------------");

		// 변수의 자동 타입 변환
		// 자식 타입은 부모 타입으로 자동 타입 변환이 될 수 있고, 메소드가 재정의되어 있을 경우
		// 재정의된 자식 메소드가 호출되는 상속의 특징이 그대로 적용된다.
		Animal animal = null;
		animal = new Dog();// 자동 타입 변환
		animal.sound();// 재정의된 메소드 호출
		animal = new Cat();// 자동 타입 변환
		animal.sound();// 재정의된 메소드 호출
		System.out.println("-----------------------------------------");
		
		// 메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}

	//부모 타입의 매개 변수에 자식 객체를 대입해서 메소드의 다형성을 적용한다.
	public static void animalSound(Animal animal) {
		animal.sound();// 재정의된 메소드 호출
	}
}
