package sec03.exam01_no_arguments_no_return;

/*
 * �Լ��� �������̽�(@FunctionalInterface)
 * �ϳ��� �߻� �޼ҵ尡 ����� �������̽����� ���ٽ��� Ÿ�� Ÿ���� �� ��  �ִµ� �̷��� �������̽��� �Լ��� �������̽���� �Ѵ�.
 * @FunctionalInterface ������̼��� �Լ��� �������̽��� �ۼ��� �� �� �� �̻�(1���� ����)�� �߻� �޼ҵ尡 ������� �ʵ��� �����Ϸ��� üŷ���ִ� ����̴�.
*/

//�Ű������� ���� Ÿ���� ���� �߻� �޼ҵ带 ���� �Լ��� �������̽�
@FunctionalInterface
public interface MyFunctionalInteface {
	
	public void method();
}
