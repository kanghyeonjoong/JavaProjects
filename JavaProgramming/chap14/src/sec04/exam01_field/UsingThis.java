package sec04.exam01_field;

public class UsingThis {
	private int outterField = 10;

	class Inner {
		int innerField = 20;

		void method() {
			/*
			 * 람다식 실행 블록에는 클래스의 멤버인 필드와 메소드를 제약 사항 없이 사용할 수 있다.
			 * 하지만 this 키워드를 사용할 때에는 주의가 필요하다. 일반적으로 익명 객체 내부에서 this는 익명 객체의 참조이지만,
			 * 람다식에서 this는 내부적으로 생성되는 익명 객체의 참조가 아니라 람다식을 실행한 객체의 참조이다.
			 * 중첩 객체 Inner에서 람다식을 실행했기 때문에 람다식 내부에서의 this는 중첩 객체 Inner이다.
			 */
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField: " + outterField);
				//바깥 객체의 참조를 얻기 위해서는 클래스명.this를 사용
				System.out.println("outterField: " + UsingThis.this.outterField + "\n");

				System.out.println("innerField: " + innerField);
				//람다식 내부에서 this는 Inner객체를 참조
				System.out.println("innerField: " + this.innerField + "\n");
			};
			fi.method();
		}
	}
}
