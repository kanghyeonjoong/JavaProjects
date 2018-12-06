package sec08.exam02_abstract_method;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----------------------------------------");

		// ������ �ڵ� Ÿ�� ��ȯ
		// �ڽ� Ÿ���� �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ�� �� �� �ְ�, �޼ҵ尡 �����ǵǾ� ���� ���
		// �����ǵ� �ڽ� �޼ҵ尡 ȣ��Ǵ� ����� Ư¡�� �״�� ����ȴ�.
		Animal animal = null;
		animal = new Dog();// �ڵ� Ÿ�� ��ȯ
		animal.sound();// �����ǵ� �޼ҵ� ȣ��
		animal = new Cat();// �ڵ� Ÿ�� ��ȯ
		animal.sound();// �����ǵ� �޼ҵ� ȣ��
		System.out.println("-----------------------------------------");
		
		// �޼ҵ��� ������
		animalSound(new Dog());
		animalSound(new Cat());
	}

	//�θ� Ÿ���� �Ű� ������ �ڽ� ��ü�� �����ؼ� �޼ҵ��� �������� �����Ѵ�.
	public static void animalSound(Animal animal) {
		animal.sound();// �����ǵ� �޼ҵ� ȣ��
	}
}
