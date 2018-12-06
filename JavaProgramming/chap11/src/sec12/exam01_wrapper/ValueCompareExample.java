package sec12.exam01_wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2));
		System.out.println("언박싱후 ==결과: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals(); 결과: " + obj1.equals(obj2));
		System.out.println();

		/*
		 * 포장 객체에 정확히 어떤 값이 저장될지 모르는 상황이라면 ==와 !=를 사용하지 않는 것이 좋다.
		 * 직접 내부 값을 언박싱해서 비교하거나, equals()메소드로 내부 값을 비교하는 것이 좋다.
		 */
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3 == obj4));
		System.out.println("언박싱후 ==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals(); 결과: " + obj3.equals(obj4));
	}

}
