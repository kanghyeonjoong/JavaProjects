package sec05.exam03_button_event;

public class Button {
	OnClickListener listener;// �������̽� Ÿ�� �ʵ�

	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	// ���� ��ü�� onClick()�޼ҵ� ȣ��
	void touch() {
		listener.onClick();
	}

	// ��ø �������̽�
	interface OnClickListener {
		void onClick();
	}
}
