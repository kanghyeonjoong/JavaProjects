package sec04.exam02_local_variable;

public class UsingLocalVariable {
	private int num;

	void method(int arg) {//arg�� finalƯ���� ����
		int localVar = 40;//localVar�� finalƯ���� ����

		//���ٽ� ���ο��� ����ϹǷ� finalƯ������ ���� ������ �Ұ��ϴ�.
		//arg = 31;
		//localVar = 41;

		/*
		 * ���ٽ��� �޼ҵ� ���ο��� �ַ� �ۼ��Ǳ� ������ ���� �͸� ���� ��ü�� ������Ų�ٰ� ���� �Ѵ�.
		 * ���ٽĿ��� �ٱ� Ŭ������ �ʵ�� �޼ҵ带 ���� ���� ����� �� ������, �޼ҵ��� �Ű� ���� �� ���� ������
		 * ���ٽ� ���ο��� ����ϸ� �� �� ������ final Ư���� ������ �Ѵ�.
		 * ���� �Ű� ���� �Ǵ� ���� ������ ���ٽĿ��� �д� ���� ��������, ���ٽ� ���� �Ǵ� �ܺο��� ������ �� ����.
		 */
		MyFunctionalInterface fi = () -> {
			num = 10;

			System.out.println("num: " + num);
			//���� ���� �б�
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
	}
}
