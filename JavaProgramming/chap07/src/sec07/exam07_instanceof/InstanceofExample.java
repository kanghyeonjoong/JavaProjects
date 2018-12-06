package sec07.exam07_instanceof;

public class InstanceofExample {
	public static void method1(Parent parent) {
		//��üŸ��Ȯ��(instanceof)
		if (parent instanceof Child) {
			//���� Ÿ�� ��ȯ(Casting)�� �ڽ� Ÿ���� �θ� Ÿ������ ��ȯ�Ǿ� �ִ� ���¿����� �����ϴ�.
			//�θ� Ÿ���� ������ �θ� ��ü�� ������ ��� �ڽ� Ÿ������ ��ȯ�� �� ����.
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child�� ��ȯ���� ����");
		}
	}

	public static void method2(Parent parent) {
		Child child = (Child) parent;// java.lang.ClassCastException�� �߻��� ���ɼ��� ����
		System.out.println("method2 - Child�� ��ȯ ����");
	}

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);

		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}
}
