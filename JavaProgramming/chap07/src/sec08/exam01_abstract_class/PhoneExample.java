package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		//�߻� Ŭ������ ��ü�� ������ �� ����.
		// Phone phone=new Phone() ;
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");

		smartPhone.turnOn();// Phone�� �޼ҵ�
		smartPhone.internetSearch();
		smartPhone.turnOff();// Phone�� �޼ҵ�

		Phone phone = new SmartPhone("������");
		phone.turnOn();
		if (phone instanceof SmartPhone) {
			((SmartPhone) phone).internetSearch();
		}
		phone.turnOff();
	}

}
