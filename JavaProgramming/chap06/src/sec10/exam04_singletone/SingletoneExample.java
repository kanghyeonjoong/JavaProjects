package sec10.exam04_singletone;

public class SingletoneExample {
	public static void main(String[] args) {
		Singletone obj1 = Singletone.getInstance();
		Singletone obj2 = Singletone.getInstance();

		if (obj1 == obj2) {
			System.out.println("���� Singletone ��ü �Դϴ�.");
		} else {
			System.out.println("�ٸ� singletone ��ü �Դϴ�.");
		}
	}
}
