package sec02.exam02_generic_type;

/*
 * ���׸� Ÿ���� Ÿ���� �Ķ���ͷ� ������ Ŭ������ �������̽��� ���Ѵ�.
 * ���׸� Ÿ���� Ŭ���� �Ǵ� �������̽� �̸� �ڿ� "<>"��ȣ�� �ٰ�, ���̿� Ÿ�� �Ķ���Ͱ� ��ġ�Ѵ�.
 */
public class Box<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}
