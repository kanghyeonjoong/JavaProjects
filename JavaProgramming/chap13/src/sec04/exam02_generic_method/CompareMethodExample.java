package sec04.exam02_generic_method;

public class CompareMethodExample {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "���");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "���");
		boolean result1 = Util.<Integer, String>compare(p1, p2);//��ü���� Ÿ���� ���������� ����
		if (result1) {
			System.out.println("���������� ������ ��ü�Դϴ�.");
		} else {
			System.out.println("���������� �������� ���� ��ü�Դϴ�.");
		}

		Pair<String, String> p3 = new Pair<String, String>("user1", "ȫ�浿");
		Pair<String, String> p4 = new Pair<String, String>("user2", "ȫ�浿");
		boolean result2 = Util.compare(p3, p4);//��ü���� Ÿ���� ����
		if (result2) {
			System.out.println("���������� ������ ��ü�Դϴ�.");
		} else {
			System.out.println("���������� �������� ���� ��ü�Դϴ�.");
		}
	}

}