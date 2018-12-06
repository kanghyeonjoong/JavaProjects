package sec02.exam01_non_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		/*
		 * ObjectŸ���� ����ϸ� ��� ������ �ڹ� ��ü�� ������ �� �ִٴ� ������ ������, ������ �� �ڵ� Ÿ�� ��ȯ�� �߻��ϰ�,
		 * �о�� ���� ���� Ÿ�� ��ȯ(ĳ����)�� �߻��Ѵ�. �̷��� Ÿ�� ��ȯ�� ��������� ��ü ���α׷��� ���ɿ� ���� ���� �����
		 * ������ �� �ִ�.
		 */
		Box box = new Box();
		box.set("ȫ�浿");//String->Object(�ڵ� Ÿ�� ��ȯ)
		String name = (String) box.get();//Object->String(���� Ÿ�� ��ȯ-casting)
		System.out.println(name);

		box.set(new Apple());//Apple->Object(�ڵ� Ÿ�� ��ȯ)
		Apple apple = (Apple) box.get();//Object->Apple(���� Ÿ�� ��ȯ)

	}

}
