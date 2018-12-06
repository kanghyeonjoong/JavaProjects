package sec07.exam01_generic_extends_implements;

//제네릭 타입도 상속이 가능하다. 자식 제네릭 타입은 추가적으로 제네릭 타입 파라미터를 가질 수 있다.
public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
}
