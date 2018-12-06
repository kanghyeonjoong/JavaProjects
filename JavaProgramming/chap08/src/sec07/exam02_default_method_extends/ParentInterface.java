package sec07.exam02_default_method_extends;

public interface ParentInterface {
	// 추상메소드
	public void method1();

	// default 메소드
	public default void method2() {
		System.out.println("ParentInterface-method2() 실행");
	}
}
