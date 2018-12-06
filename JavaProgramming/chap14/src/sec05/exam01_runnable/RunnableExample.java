package sec05.exam01_runnable;

public class RunnableExample {

	public static void main(String[] args) {
		/*
		 * ǥ�� API���� �� ���� �߻� �޼ҵ带 ������ �������̽����� ��� ���ٽ��� �̿��ؼ�
		 * �͸� ���� ��ü�� ǥ���� �����ϴ�.
		 * �ڹٿ����� ����ϰ� ���Ǵ� �Լ��� �������̽�(functional interface)�� java.util.function ǥ��API ��Ű���� �����Ѵ�.
		 * �� ��Ű������ �����ϴ� �Լ��� �������̽��� ������ �޼ҵ� �Ǵ� �������� �Ű� Ÿ������  ���Ǿ� ���ٽ��� ������ �� �ֵ��� �ϱ� ���ؼ��̴�.
		 */
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};

		//���1
		Thread thread = new Thread(runnable);
		thread.start();
		
		//���2
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		});
		System.out.println();
		thread2.start();
	}

}
