package sec06.exam01_interface_extends;

public class ImplementationC implements InterfaceC {
	//���� �������̽��� �����ϴ� Ŭ������ ���� �������̽��� �޼ҵ�Ӹ� �ƴ϶� ���� �������̽��� ��� 
	//�߻� �޼ҵ忡 ���� ��ü �޼ҵ带 ������ �־�� �Ѵ�.
	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() ����");

	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() ����");

	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() ����");

	}

}