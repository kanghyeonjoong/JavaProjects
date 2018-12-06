package sec07.exam02_default_method_extends;

public interface ChildInterface3 extends ParentInterface {
	// ParentInterface의 디폴트 메소드 method2()를 추상 메소드로 재선언한다.
	@Override
	public void method2();

	// 추상메소드
	public void method3();
}
