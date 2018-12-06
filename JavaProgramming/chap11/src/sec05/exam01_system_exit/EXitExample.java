package sec05.exam01_system_exit;

public class EXitExample {

	public static void main(String[] args) {
		
		//특정한  값이 입력되었을 때 종료하고 싶다면 자바의 보안 관리자를 직접 설정해서 종료 상태 값을 확인하면 된다.
		//System.exit()가 실행되면 보안 관리자의 checkExit()메소드가 자동으로 호출되는데, 이 메소드에서 종료 상태값을 조사해서
		//특정 값이 입력되지 않으면 SecurityException을 발생시켜 System.exit()를 호출한 곳에서 예외 처리를 할 수 있도록 한다.
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) throws SecurityException {
				if (status != 5) {
					throw new SecurityException();
				} else {
					System.out.println(" : 정상 종료.");
				}
			}
		});

		for (int i = 0; i < 10; i++) {
			System.out.print(i);

			try {
				System.exit(i);
			} catch (SecurityException e) {
				System.out.println(" : 종료하지 못함.");
			}
		}
	}

}
