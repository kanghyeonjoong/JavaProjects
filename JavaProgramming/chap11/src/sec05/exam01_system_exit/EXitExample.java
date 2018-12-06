package sec05.exam01_system_exit;

public class EXitExample {

	public static void main(String[] args) {
		
		//Ư����  ���� �ԷµǾ��� �� �����ϰ� �ʹٸ� �ڹ��� ���� �����ڸ� ���� �����ؼ� ���� ���� ���� Ȯ���ϸ� �ȴ�.
		//System.exit()�� ����Ǹ� ���� �������� checkExit()�޼ҵ尡 �ڵ����� ȣ��Ǵµ�, �� �޼ҵ忡�� ���� ���°��� �����ؼ�
		//Ư�� ���� �Էµ��� ������ SecurityException�� �߻����� System.exit()�� ȣ���� ������ ���� ó���� �� �� �ֵ��� �Ѵ�.
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) throws SecurityException {
				if (status != 5) {
					throw new SecurityException();
				} else {
					System.out.println(" : ���� ����.");
				}
			}
		});

		for (int i = 0; i < 10; i++) {
			System.out.print(i);

			try {
				System.exit(i);
			} catch (SecurityException e) {
				System.out.println(" : �������� ����.");
			}
		}
	}

}
