package sec05.try_with_resources;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			
			throw new Exception();// ���������� ���ܸ� �߻���Ŵ
		} catch (Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}

	}

}