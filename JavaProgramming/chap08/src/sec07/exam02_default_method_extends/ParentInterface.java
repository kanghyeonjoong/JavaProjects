package sec07.exam02_default_method_extends;

public interface ParentInterface {
	// �߻�޼ҵ�
	public void method1();

	// default �޼ҵ�
	public default void method2() {
		System.out.println("ParentInterface-method2() ����");
	}
}
