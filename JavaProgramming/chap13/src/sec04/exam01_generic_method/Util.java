package sec04.exam01_generic_method;

public class Util {
	/*
	 * ���׸� �޼ҵ�� �Ű� Ÿ�԰� ���� Ÿ������ Ÿ�� �Ķ���͸� ���� �޼ҵ带 ���Ѵ�.
	 * ���׸� �޼ҵ� ���� ����� ���� Ÿ�� �տ� <>��ȣ�� �߰��ϰ� Ÿ�� �Ķ���͸� ����� ����,
	 * ���� Ÿ�԰� �Ű� Ÿ������ Ÿ�� �Ķ���͸� ����ϸ� �ȴ�.
	 * public <Ÿ�� �Ķ����,...> ����Ÿ�� �޼ҵ��(�Ű�����,...) {...}
	 */
	public static <T> Box<T> boxing(T t){
		Box<T>box=new Box<>();
		box.set(t);
		
		return box;
	}
}
