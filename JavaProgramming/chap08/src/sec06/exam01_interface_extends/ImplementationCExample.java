package sec06.exam01_interface_extends;

public class ImplementationCExample {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();

		InterfaceA ia = impl;
		ia.methodA();// InterfaceA ������ methodA()�� ȣ�� ����
		System.out.println();

		InterfaceB ib = impl;
		ib.methodB();// InterfaceB ������ methodB()�� ȣ�� ����
		System.out.println();

		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
