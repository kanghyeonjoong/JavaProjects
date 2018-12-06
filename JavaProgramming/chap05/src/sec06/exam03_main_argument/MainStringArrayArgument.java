package sec06.exam03_main_argument;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("프로그램 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}

		String strNum1 = args[0];
		String strNum2 = args[1];

		try {
			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);

			int result = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
