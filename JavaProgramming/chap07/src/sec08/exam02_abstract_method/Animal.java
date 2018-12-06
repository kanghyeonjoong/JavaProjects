package sec08.exam02_abstract_method;


//추상 클래스는 실체클래스가 공통적으로 가져야 할 필드와 메소드들을 정의해 놓은 추상적인 클래스이므로 
//실체 클래스의 멤버(필드, 메소드)를 통일화하는데 목적이 있다.
//하지만 메소드의 선언만 통일화하고, 실행 내용은 실체 클래스마다 달라야 하는 경우에는 추상 메소드를 선언한다.
//추상 클래스를 설계할 때, 하위 클래스가 반드시 실행 내용을 채우도록 강요하고 싶은 메소드가 있을 경우, 해당 메소드를 추상 메소드로 선언하면 된다.
//자식 클래스는 반드시 추상 메소드를 재정의(Overriding)해서 실행 내용을 작성해야 한다.
public abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();//추상 메소드
}
