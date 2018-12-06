package sec06.exam01_generic_wildcard;

//���׸� Ÿ�� Course : Ÿ���� �Ķ���ͷ� ������ Ŭ������ �������̽�
public class Course<T> {
	String name;//������
	private T[] students;//�������� �����ϴ� Ÿ�� �Ķ���� �迭

	public Course(String name, int capacity) {
		this.name = name;
		//Ÿ�� �Ķ���ͷ� �迭�� �����Ϸ��� new T[n]���·� �迭�� ������ �� ����
		//(T[]) (new Object[n])���� �����ؾ� �Ѵ�.
		students = (T[]) (new Object[capacity]);
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	//�迭�� ����ִ� �κ��� ã�Ƽ� �������� �߰��ϴ� �޼ҵ�
	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
