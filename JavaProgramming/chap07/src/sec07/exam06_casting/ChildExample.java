package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child(); // �ڵ�Ÿ�Ժ�ȯ(Promotion)
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

	/*	parent.field2 = "data2";
		parent.method3();*/

		//�ڽ� Ÿ���� �θ� Ÿ������ �ڵ� ��ȯ�ϸ�, �θ� Ÿ�Կ� ����� �ʵ�� �޼ҵ常 ��� �����ϴ�.
		//���� �ڽ� Ÿ�Կ� ����� �ʵ�� �޼ҵ带 �� ����ؾ� �Ѵٸ� ���� Ÿ�� ��ȯ�� �ؼ� �ٽ� �ڽ� Ÿ������
		//��ȯ�� ���� �ڽ� Ÿ���� �ʵ�� �޼ҵ带 ����ϸ� �ȴ�.
		Child child = (Child) parent;//����Ÿ�Ժ�ȯ(Casting)
		child.field2 = "data2";
		child.method3();
	}

}
