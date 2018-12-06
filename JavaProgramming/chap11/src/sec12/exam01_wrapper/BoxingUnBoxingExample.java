package sec12.exam01_wrapper;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		/*
		 * �ڹٴ� �⺻ Ÿ��(byte, char, short, int, long, float, double, boolean)�� ���� ���� ��ü������(Wrapper) ��ü�� �Ѵ�.
		 * Ư¡�� �����ϰ� �ִ� �⺻ Ÿ���� ���� �ܺο��� ������ �� ����. ���� ������ ���� �����ϰ� �ʹٸ� ���ο� ���� ��ü�� ������ �Ѵ�.
		 * �⺻ Ÿ���� ���� ���� ��ü�� ����� ������ �ڽ�(Boxing)�̶�� �Ѵ�. �ݴ�� ���� ��ü���� �⺻ Ÿ���� ���� ���� ������ ��ڽ�(Unboxing)�̶�� �Ѵ�.
		 */

		/*
		 * Boxing�� �ϴ� ���
		 * 1. ���� Ŭ������ �����ڸ� �̿��Ͽ� �����ϴ� ���(�Ű������� �⺻ Ÿ���� �� �Ǵ� ���ڿ��� �Ѱ��ش�)
		 * 2. ���� Ŭ�������� ������ �ִ� valueOf() ���� �޼ҵ带 �̿��ϴ� ���
		 */
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		/*
		 * Unboxing�ϴ� ���
		 * ���� ��ü���� �ٽ� �⺻ Ÿ���� ���� ���� ���ؼ��� �� ���� Ŭ�������� ������ �ִ� "�⺻Ÿ�Ը�+Value()"�޼ҵ带 ȣ���Ѵ�.
		 */
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
