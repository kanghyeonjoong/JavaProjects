package sec07.exam02_string_method;

public class StringTrimExample {

	public static void main(String[] args) {
		String tel1 = "  02";
		String tel2 = "123     ";
		String tel3 = "            1234          ";

		/*
		 * ���ڿ� �յ� ���� �߶󳻱�(trim())
		 * trim()�޼ҵ�� ���ڿ��� �յ� ������ ������ ���ο� ���ڿ��� �����ϰ� �����Ѵ�.
		 */
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);

	}

}
