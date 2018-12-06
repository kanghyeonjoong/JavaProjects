package sec05.exam01_anonymous_extends;

public class Anonymous {
	// ���� ����� �ʱⰪ ����
	// �θ� Ŭ����(�Ű���,...) { }�� �θ� Ŭ������ ����ؼ� �߰�ȣ { }�� ���� �ڽ� Ŭ������ �����϶�� ���̰�, new �����ڴ�
	// �̷��� ����� �ڽ� Ŭ������ ��ü�� �����Ѵ�.
	// �θ�Ŭ����(�Ű���,...)�� �θ� �����ڸ� ȣ���ϴ� �ڵ��̴�.
	Person field= new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}

		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};

	// ���� ���� ����� �ʱⰪ ����
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};

		// ���� ���� ���
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}
