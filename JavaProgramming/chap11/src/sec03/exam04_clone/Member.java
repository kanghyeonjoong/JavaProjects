package sec03.exam04_clone;

//��ü ������ ���� ��ü�� �ʵ尪�� ������ ���� ������ ��ü�� �����ϴ� ���� ���Ѵ�.
//���� ����(thin clone)�� �ܼ��� �ʵ尪�� �����ؼ� ��ü�� �����ϴ� ���� ���Ѵ�. �ʵ尪�� �����ϱ� ������ 
//�ʵ尡 �⺻ Ÿ���� ��� �� ���簡 �Ͼ��, �ʵ尡 ���� Ÿ���� ��쿡�� ��ü�� ������ ����ȴ�.
//Object�� clone()�޼ҵ�� �ڽŰ� ������ �ʵ尪�� ���� ���� ������ ��ü�� �����Ѵ�.
//clone()�޼ҵ�� ��ü�� �����Ϸ��� ���� ��ü�� �ݵ�� java.lang.Cloneable �������̽��� �����ؾ� �Ѵ�.
//Cloneable �������̽��� �߻� �޼ҵ� ������ �������� �ұ��ϰ� Cloneable�������̽��� ��������� �����ϴ� ������
//������ ����Ѵٴ� �ǵ����� ǥ�ø� �ϱ� ���ؼ��̴�.
public class Member implements Cloneable {
	private String id;
	private String name;
	private String password;
	private int age;
	private boolean adult;

	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public boolean isAdult() {
		return adult;
	}

	public Member getMember() {
		Member cloned = null;

		try {
			//clone()�� ���� Ÿ���� Object�̹Ƿ� Member Ÿ������ ���� Ÿ�� ��ȯ(Casting)�ؾ� �Ѵ�.
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
		}

		return cloned;
	}
}
