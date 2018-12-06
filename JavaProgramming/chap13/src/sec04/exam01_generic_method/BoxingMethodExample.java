package sec04.exam01_generic_method;

public class BoxingMethodExample {

	public static void main(String[] args) {
		/*
		 * 제네릭 메소드 호출하는 방법
		 * 1. 리턴타입 변수 =<구체적인 타입>메소드명(매개값);//명시적으로 구체적인 타입을 지정
		 * 2. 리턴타입 변수 = 메소드명(매개값);//매개값을 보고 구체적인 타입을 추정
		 */
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();//unboxing
		System.out.println(intValue);

		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);

	}

}
