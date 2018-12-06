package sec04.exam01_nestedinterface;

//��ø �������̽��� Ŭ������ ����� ����� �������̽��� ���Ѵ�.
//�������̽��� Ŭ���� ���ο� �����ϴ� ������ �ش� Ŭ������ ����� ���踦 �δ� ���� Ŭ������ ����� ���ؼ��̴�.
//Ư�� UI���α׷��ֿ��� �̺�Ʈ�� ó���� �������� ���� ���ȴ�.
public class Button {
	// �ʵ�
	OnClickListener listener;// �������̽� Ÿ�� �ʵ�

	// �������̽��� ���� ��ü�� �޾� �ʵ忡 �����Ѵ�.
	void setOnClickListener(OnClickListener listener) {// �Ű������� ������
		this.listener = listener;
	}

	// ��ư �̺�Ʈ(touch()�޼ҵ尡 ����Ǿ��� ��)�������̽��� ���� ���� ��ü�� �޼ҵ�(listener.onClick())�� ȣ���Ѵ�.
	void touch() {
		listener.onClick();
	}

	// ��ø �������̽�
	interface OnClickListener {
		// �߻� �޼ҵ�
		void onClick();
	}
}
