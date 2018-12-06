package sec07.exam02_default_method_extends;

public interface ChildInterface2 extends ParentInterface {
	// ParentInterface의 디폴트 메소드인 method2()를 재정의한다.
	@Override
	default void method2() {
		System.out.println("ChildInterface2-method2() 실행");
	}

	// 추상메소드
	public void method3();
}
