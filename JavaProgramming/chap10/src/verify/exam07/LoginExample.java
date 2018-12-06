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

	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {// 사용자 정의
																												// 예외
																												// 떠넘기기
		if (!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}

		if (!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 클립니다.");
		}
	}
}
