package sec10.exam02_static_block;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;

	// ���� �ʵ��� ������ �ʱ�ȭ �۾��� ���ؼ� ���� ���(static block)�� �����Ѵ�.
	// ���� ����� Ŭ������ �޸𸮷� �ε��� �� �ڵ������� ����ȴ�. ���� ����� Ŭ���� ���ο� ���� ���� ����Ǿ �������.
	// Ŭ������ �޸𸮷� �ε��� �� ����� ������� ����ȴ�.
	static {
		info = company + "-" + model;
	}
}
