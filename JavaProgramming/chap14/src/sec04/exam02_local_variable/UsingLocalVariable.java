package sec04.exam02_local_variable;

public class UsingLocalVariable {
	private int num;

	void method(int arg) {//arg는 final특성을 가짐
		int localVar = 40;//localVar는 final특성을 가짐

		//람다식 내부에서 사용하므로 final특성으로 인한 수정이 불가하다.
		//arg = 31;
		//localVar = 41;

		/*
		 * 람다식은 메소드 내부에서 주로 작성되기 때문에 로컬 익명 구현 객체를 생성시킨다고 봐야 한다.
		 * 람다식에서 바깥 클래스의 필드와 메소드를 제한 없이 사용할 수 있으나, 메소드의 매개 변수 및 로컬 변수를
		 * 람다식 내부에서 사용하면 이 두 변수는 final 특성을 가져야 한다.
		 * 따라서 매개 변수 또는 로컬 변수를 람다식에서 읽는 것은 허용되지만, 람다식 내부 또는 외부에서 변경할 수 없다.
		 */
		MyFunctionalInterface fi = () -> {
			num = 10;

			System.out.println("num: " + num);
			//로컬 변수 읽기
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
	}
}
