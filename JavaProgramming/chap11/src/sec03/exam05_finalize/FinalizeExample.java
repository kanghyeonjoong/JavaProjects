package sec03.exam05_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		for (int i = 1; i <= 50; i++) {
			counter = new Counter(i);

			counter = null;// Counter객체를 쓰레기로 만듬

			System.gc();// 쓰레기 수집기 실행 요청
		}

	}

}
