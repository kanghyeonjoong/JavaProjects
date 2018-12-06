package sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		/* 
		 * 자동 Boxing 
		 * 자동 박싱은 포장 클래스 타입에  기본값이 대입될 경우에 발생한다.  힙 영역에 객체가 생성된다.
		 */
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());

		/* 
		 * 자동 Unboxing 
		 * 자동 언박싱은 기본  타입에 포장 객체가 대입될 경우에 발생한다.
		 */
		int value = obj;
		System.out.println("value : " + value);

		/* 
		 * 연산시 자동 Unboxing 
		 * 포장 객체와  기본 타입값을 연산할 경우에도 발생한다.
		 */
		int result = obj + 100;
		System.out.println("result : " + result);
	}

}
