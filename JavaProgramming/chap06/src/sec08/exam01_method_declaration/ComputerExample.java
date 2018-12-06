package sec08.exam01_method_declaration;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();

		int[] values = { 1, 2, 3 };
		int result1 = myCom.sum1(values);
		System.out.println("result1 : " + result1);

		int result2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("result2 : " + result2);

		//"..."로 선언된 매개 변수의 값은 메소드 호출 시 리스트로 나열해 준다.
		//"..."로 선언된 매개 변수는 배열 타입이므로 배열을 직접 매개값으로 사용해도 된다.
		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3 : " + result3);

		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4 : " + result4);

	}
}
