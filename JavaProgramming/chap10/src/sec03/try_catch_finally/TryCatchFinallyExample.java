package sec03.try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			// Class.forName()�޼ҵ�� �Ű������� �־��� Ŭ������ �����ϸ� Class��ü�� ����������
			// �������� ������ ClassNotFoundException ���ܸ� �߻���Ų��.
			Class cls = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}

	}

}
