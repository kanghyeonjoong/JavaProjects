package sec04.exam03_static_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		//���� ��ü�� �������̽� Ÿ�Կ� ���ԵǸ�  �������̽��� ����� �߻� �޼ҵ带 ���� �ڵ忡�� ȣ���� �� �ְ� �ȴ�.
		RemoteControl rc = null;// �������̽� ���� ����

		rc = new Television();//Television ��ü�� �������̽� Ÿ�Կ� ����
		rc.trurnOn();
		rc.turnOff();
		rc.setMute(true);
		
		//�������̽��� ���� �޼ҵ�� �������̽��� �ٷ� ȣ���� �����ϴ�.
	    RemoteControl.changeBattery();
	    
		rc = new Audio();//Audio��ü�� �������̽� Ÿ�Կ� ����
		rc.trurnOn();
		rc.turnOff();
		rc.setMute(true);
	}
}
