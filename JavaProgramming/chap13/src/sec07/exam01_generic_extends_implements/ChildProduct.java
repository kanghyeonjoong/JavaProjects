package sec07.exam01_generic_extends_implements;

//���׸� Ÿ�Ե� ����� �����ϴ�. �ڽ� ���׸� Ÿ���� �߰������� ���׸� Ÿ�� �Ķ���͸� ���� �� �ִ�.
public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
}
