package sec04.exam01_field;

public class UsingThis {
	private int outterField = 10;

	class Inner {
		int innerField = 20;

		void method() {
			/*
			 * ���ٽ� ���� ��Ͽ��� Ŭ������ ����� �ʵ�� �޼ҵ带 ���� ���� ���� ����� �� �ִ�.
			 * ������ this Ű���带 ����� ������ ���ǰ� �ʿ��ϴ�. �Ϲ������� �͸� ��ü ���ο��� this�� �͸� ��ü�� ����������,
			 * ���ٽĿ��� this�� ���������� �����Ǵ� �͸� ��ü�� ������ �ƴ϶� ���ٽ��� ������ ��ü�� �����̴�.
			 * ��ø ��ü Inner���� ���ٽ��� �����߱� ������ ���ٽ� ���ο����� this�� ��ø ��ü Inner�̴�.
			 */
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField: " + outterField);
				//�ٱ� ��ü�� ������ ��� ���ؼ��� Ŭ������.this�� ���
				System.out.println("outterField: " + UsingThis.this.outterField + "\n");

				System.out.println("innerField: " + innerField);
				//���ٽ� ���ο��� this�� Inner��ü�� ����
				System.out.println("innerField: " + this.innerField + "\n");
			};
			fi.method();
		}
	}
}
