package sec07.exam02_default_method_extends;

public interface ChildInterface2 extends ParentInterface {
	// ParentInterface�� ����Ʈ �޼ҵ��� method2()�� �������Ѵ�.
	@Override
	default void method2() {
		System.out.println("ChildInterface2-method2() ����");
	}

	// �߻�޼ҵ�
	public void method3();
}
