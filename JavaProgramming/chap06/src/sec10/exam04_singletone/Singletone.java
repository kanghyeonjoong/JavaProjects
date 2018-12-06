package sec10.exam04_singletone;

//전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 경우가 있다. 단 하나만 생성된다고 해서 이 객체를 싱글톤(Singletone)이라고 한다.
//싱글톤을 만들려면 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아야 한다. 생성자를 호출한 만큼 객체가 생성되기 때문이다.
//생성자를 외부에서 호출할 수 없도록 하려면 생성자 앞에 private 접근 제한자를 붙여주면 된다.
public class Singletone {
	private static Singletone singletone = new Singletone();

	private Singletone() {
	}

	static Singletone getInstance() {
		return singletone;
	}
}
