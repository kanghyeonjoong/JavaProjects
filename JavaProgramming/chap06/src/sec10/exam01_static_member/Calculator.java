package sec10.exam01_static_member;

//����(static)�� '������'�̶� �ǹ̸� ������ �ִ�. ���� ����� Ŭ������ ������ ����μ� ��ü�� �������� �ʰ� ����� �� �ִ� �ʵ�� �޼ҵ带 ���Ѵ�.
//���� ����� ��ü(�ν��Ͻ�)�� �Ҽӵ� ����� �ƴ϶� Ŭ������ �Ҽӵ� ����̱� ������ Ŭ���� ������ �Ѵ�.
public class Calculator {
	// �ʵ�
	static double pi = 3.14159;

	// ������

	// �޼ҵ�
	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}
