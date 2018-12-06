package sec04.exam03_objects_hash_hashcode;

import java.util.Objects;

public class Student {
	private int sno;
	private String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		//Objects.hash(Object...values)�޼ҵ�� �Ű������� �־��� ������ �̿��ؼ� �ؽ� �ڵ带 �����ϴµ�, �־��� �Ű������� �迭�� �����ϰ�
		//Arrays.hashCode(Object[])�� ȣ���ؼ� �ؽ��ڵ带 ��� �����Ѵ�.
		//Objects.hash()�޼ҵ�� Ŭ������ hashCode()�� �������� �� ���ϰ��� �����ϱ� ���� ����Ѵ�.
		return Objects.hash(sno, name);
	}
}
