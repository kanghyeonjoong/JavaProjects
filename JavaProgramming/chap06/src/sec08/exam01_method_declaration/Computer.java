package sec08.exam01_method_declaration;

public class Computer {
	// �޼ҵ�
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}

		return sum;
	}

	//�Ű� ������ "..."�� ����ؼ� �����ϰ� �Ǹ�, �޼ҵ� ȣ�� �� �Ѱ��� ���� ���� ����  �ڵ�����
	//�迭�� �����ǰ� �Ű������� ���ȴ�.
	int sum2(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}

		return sum;
	}
}
