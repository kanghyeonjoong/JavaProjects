package sec06.exam06_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrCopy = new String[5];

		// 참조 타입 배열의 경우, 배열 복사가 되면 복사되는 값이 객체의 번지이므로 새 배열의 항목은 이전 배열의 항목이 참조하는 객체와 동일하다.
		// 이것을 얕은 복사(shallow copy)라고 한다.
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
