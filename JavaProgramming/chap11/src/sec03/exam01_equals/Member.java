package sec03.exam01_equals;

import java.util.Objects;

public class Member {
	// �ʵ�
	private String id;

	// ������
	public Member(String id) {
		this.id = id;
	}

	// �޼ҵ�
	public String getId() {
		return id;
	}

	// �� ��ü�� ���� ���� �� equals()�޼ҵ带 ����Ѵ�. �������� �����ϴٴ� ���� ���� ��ü�̰� �ٸ� ��ü�̰�
	// ������� ��ü�� �����ϰ� �ִ� �����Ͱ� �������� ���Ѵ�.
	// String��ü�� equals()�޼ҵ�� String��ü�� ������ ���ϴ� ���� �ƴ϶�, ���ڿ��� �������� �����ؼ� ������ true��
	// �����ϰ�,
	// �ٸ��� false�� �����Ѵ�. �̰��� ������ ������ StringŬ������ Object�� equals()�޼ҵ带 ������ �ؼ� ���� �񱳰� �ƴ�
	// ���ڿ� �񱳷� �����߱� �����̴�.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {// �Ű����� MemberŸ������ Ȯ��
			Member member = (Member) obj;// MemberŸ������ ���� Ÿ�� ��ȯ(Casting)

			if (id.equals(member.getId())) {
				return true;
			}
		}

		return false;
	}

	// String ��ü�� hashCode()�� ���� ���ڿ��� ��� ������ �ؽ��ڵ带 �����Ѵ�.
	@Override
	public int hashCode() {
		// return id.hashCode();
		return Objects.hash(id);
	}
}
