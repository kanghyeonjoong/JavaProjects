package verify.exam07;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (NotExistIDException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			login("blue", "54321");
		} catch (WrongPasswordException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {// ����� ����
																												// ����
																												// ���ѱ��
		if (!id.equals("blue")) {
			throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
		}

		if (!password.equals("12345")) {
			throw new WrongPasswordException("�н����尡 Ŭ���ϴ�.");
		}
	}
}
