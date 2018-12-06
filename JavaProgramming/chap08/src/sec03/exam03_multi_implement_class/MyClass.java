package sec03.exam03_multi_implement_class;

//�����ڵ忡�� �������̽��� Ŭ������ �ʵ�, ������ �Ǵ� �޼ҵ��� �Ű�����, ������ �Ǵ� �޼ҵ��� ���� ������ ����� �� �ִ�.
public class MyClass {
	// �ʵ�
	RemoteControl rc = new Television();

	// ������
	public MyClass(RemoteControl rc) {
		this.rc = rc;
	}

	// �޼ҵ�
	void methodA() {
		// ���� ����
		RemoteControl rc = new Audio();
		rc.setMute(true);
	}

	void methodB(RemoteControl rc) {
		rc.trurnOn();
		rc.turnOff();
	}

	void methodC() {
		this.rc.trurnOn();
		this.rc.turnOff();
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass(new Audio());
		myClass.methodC();
		
		myClass.methodB(new Television());
		myClass.methodA();
	}
}
