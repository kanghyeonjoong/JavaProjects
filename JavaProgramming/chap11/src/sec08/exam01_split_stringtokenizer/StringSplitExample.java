package sec08.exam01_split_stringtokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "Ȧ�浿&�̼�ȫ,�鿬��,���ڹ�-�ֿ�ȣ";

		/*
		 * ���ڿ��� Ư�� ������(delimiter)�� ����Ǿ� ���� ���, �����ڸ� �������� �κ� ���ڿ��� �и��ϱ� ���ؼ���
		 * String�� split()�޼ҵ带 �̿��ϰų�, java.lang��Ű���� StringTokenizerŬ������ �̿��� �� �ִ�.
		 * split()�� ���� ǥ�������� �����ϰ�, StringTokenizer�� ���ڷ� �����Ѵ�.
		 * split()�� ���� ǥ������ �����ڷ� �ؼ� ���ڿ��� �и��� ��, �迭�� �����ϰ� �����Ѵ�.
		 */
		String[] names = text.split("&|,|-");

		for (String name : names) {
			System.out.println(name);
		}

	}

}
