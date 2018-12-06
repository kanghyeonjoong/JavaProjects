package sec04.exam01_hashmap;

public class Student {
	private int sno;
	private String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public int getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}

	/* �й��� �̸��� ���� ��� ������ Ű�� �����ϱ� ���ؼ� hashCode()�� equals()�޼ҵ带 �������Ѵ�. */
	@Override
	public boolean equals(Object obj) {//�й��� �̸��� ������ ��� true�� ����
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		}

		return false;
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();//�й��� �̸��� ���ٸ� ������ ���� ����
	}
}
