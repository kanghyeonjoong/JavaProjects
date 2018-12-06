package sec03.exam02_hashcode;

public class Key {
	private int number;

	public Key(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;

			if (this.number == compareKey.number) {
				return true;
			}
		}
		
		return false;
	}
	
	//��ü �ؽ��ڵ�� ��ü�� �ĺ��� �ϳ��� �������� ���Ѵ�. Object�� hashCode()  �޼ҵ�� ��ü�� �޸� ������ �̿��ؼ�
	//�ؽ��ڵ带 ����� �����ϱ� ������ ��ü���� �ٸ� ���� ������ �ִ�.
	//���� ���� �� �� hashCode()�� �������� �ʿ伺�� �ִµ�, �÷��� �����ӿ�ũ���� HashSet, HashMap, Hashtable��
	//������ ���� ������� �� ��ü�� �������� ���Ѵ�.
	//�켱 hashCode()�޼ҵ带 �����ؼ� ���ϵ� �ؽ��ڵ� ���� ������ ����. �ؽ��ڵ� ���� �ٸ��� �ٸ� ��ü�� �Ǵ��ϰ�, �ؽ��ڵ� ����
	//������ equals()�޼ҵ�� �ٽ� ���Ѵ�.
	@Override
	public int hashCode() {
		
		return this.number;
	}
}
