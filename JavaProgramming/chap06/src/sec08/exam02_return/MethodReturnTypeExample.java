package sec08.exam02_return;

public class MethodReturnTypeExample {

	int method1(int x, int y) {
		int result = x + y;
		return result;
	}

	void method2() {
		int result1 = method1(10, 20);
		
		//���� Ÿ���� �޼ҵ��� ���� Ÿ�԰� �����ϰų�, Ÿ�� ��ȯ �� �� �־�� �Ѵ�.
		//int Ÿ���� double Ÿ������ �ڵ� ��ȯ�Ǳ� ������ int ���ϰ��� double ������ ������ �� �ִ�.
		double result2 = method1(10, 20);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
	}

	public static void main(String[] args) {
		MethodReturnTypeExample mrt = new MethodReturnTypeExample();
		mrt.method2();
	}

}
