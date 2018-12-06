package sec06.exam06_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrCopy = new String[5];

		// ���� Ÿ�� �迭�� ���, �迭 ���簡 �Ǹ� ����Ǵ� ���� ��ü�� �����̹Ƿ� �� �迭�� �׸��� ���� �迭�� �׸��� �����ϴ� ��ü�� �����ϴ�.
		// �̰��� ���� ����(shallow copy)��� �Ѵ�.
		System.arraycopy(oldStrArray, 0, newStrCopy, 0, oldStrArray.length);

		for (int i = 0; i < newStrCopy.length; i++) {
			System.out.print(newStrCopy[i] + ((i == newStrCopy.length - 1) ? "" : ", "));
		}
		System.out.println();

		int i = 0;
		for (String item : newStrCopy) {
			i++;
			System.out.print(item + ((i == newStrCopy.length) ? "" : ", "));
		}
	}

}
