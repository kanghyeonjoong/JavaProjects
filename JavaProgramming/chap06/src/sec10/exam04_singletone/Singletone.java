package sec10.exam04_singletone;

//��ü ���α׷����� �� �ϳ��� ��ü�� ���鵵�� �����ϴ� ��찡 �ִ�. �� �ϳ��� �����ȴٰ� �ؼ� �� ��ü�� �̱���(Singletone)�̶�� �Ѵ�.
//�̱����� ������� Ŭ���� �ܺο��� new �����ڷ� �����ڸ� ȣ���� �� ������ ���ƾ� �Ѵ�. �����ڸ� ȣ���� ��ŭ ��ü�� �����Ǳ� �����̴�.
//�����ڸ� �ܺο��� ȣ���� �� ������ �Ϸ��� ������ �տ� private ���� �����ڸ� �ٿ��ָ� �ȴ�.
public class Singletone {
	private static Singletone singletone = new Singletone();

	private Singletone() {
	}

	static Singletone getInstance() {
		return singletone;
	}
}
