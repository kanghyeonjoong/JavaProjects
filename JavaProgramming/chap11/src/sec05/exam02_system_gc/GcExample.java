package sec05.exam02_system_gc;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;

		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);

		System.out.print("emp�� ���������� �����ϴ� �����ȣ : ");
		System.out.println(emp.getEno());

		// JVM�� �޸𸮰� ������ ���� CPU�� �Ѱ��� ���� ������ ������(Garbage Collector)�� �������
		// ������� ���� ��ü�� �ڵ� �����Ѵ�.
		// System.gc()�޼ҵ尡 ȣ��Ǹ� ������ �����Ⱑ �ٷ� ����Ǵ� ���� �ƴϰ�, JVM�� ���� �ð� ����
		// �����Ű�� ���� ����Ѵ�.
		System.gc();// ������ ������ ���� ��û
	}

}
