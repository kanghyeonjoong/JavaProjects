package sec08.exam02_return;

public class MethodReturnTypeExample {

	int method1(int x, int y) {
		int result = x + y;
		return result;
	}

	void method2() {
		int result1 = method1(10, 20);
		
		//변수 타입은 메소드의 리턴 타입과 동일하거나, 타입 변환 될 수 있어야 한다.
		//int 타입은 double 타입으로 자동 변환되기 때문에 int 리턴값은 double 변수에 대입할 수 있다.
		double result2 = method1(10, 20);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
	}

	public static void main(String[] args) {
		MethodReturnTypeExample mrt = new MethodReturnTypeExample();
		mrt.method2();
	}

}
