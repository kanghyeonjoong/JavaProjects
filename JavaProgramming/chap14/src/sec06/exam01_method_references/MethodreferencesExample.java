package sec06.exam01_method_references;

import java.util.function.IntBinaryOperator;

public class MethodreferencesExample {

	public static void main(String[] args) {
		IntBinaryOperator operator;//두 개의 int연산

		/*
		 * 메소드 참조: 메소드를 참조해서 매개변수의 정보 및 리턴 타입을 알아내어, 람다식에서 불필요한 매개 변수를 제거하는 것이 목적이다.
		 * 1. 정적 메소드 참조 : 클래스::메소드
		 * 2.인스턴스 메소드 참조 : 참조변수::메소드
		 */
		//정적 메소드 참조
		operator = (x, y) -> Calculator.staticMethod(x, y);
		int result1 = operator.applyAsInt(1, 2);
		System.out.println("결과1: " + result1);

		operator = Calculator::staticMethod;
		int result2 = operator.applyAsInt(3, 4);
		System.out.println("결과2: " + result2);

		//인스턴스메소드 참조
		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);
		int result3 = operator.applyAsInt(5, 6);
		System.out.println("결과3: " + result3);

		operator = obj::instanceMethod;
		int result4 = operator.applyAsInt(7, 8);
		System.out.println("결과4: " + result4);
	}

}
