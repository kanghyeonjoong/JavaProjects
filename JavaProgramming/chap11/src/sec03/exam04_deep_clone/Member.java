package sec03.exam04_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable {
	private String name;
	private int age;
	
	//참조 타입 필드(깊은 복제의 대상)
	private int[] scores;
	private Car car;

	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public void setScores(int i, int value) throws ArrayIndexOutOfBoundsException {
		this.scores[i] = value;
	}

	public int[] getScores() {
		return scores;
	}

	public Car getCar() {
		return car;
	}

	//얕은 복제(thin clone)의 경우 참조 타입 필드는 번지만 복제되기 때문에 원본 객체의 필드와 복제 객체의 필드는
	//같은 객체를 참조하게 된다. 만약 복제 객체에서 참조 객체를 변경하면 원본 객체도 변경된 객체를 가지게 된다.
	//깊은 복제(deep clone)란 참조하고 있는 객체도 복제하는 것을 말한다. 깊은 복제를 하려면 Object의 clone()메소드를
	//재정의해서 참조 객체를 복제하는 코드를 직접 작성해야한다.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복사를 해서 name, age를 복제한다.
		Member cloned = (Member) super.clone();//Object의 clone()호출

		// scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);

		// car를 깊은 복제한다.
		cloned.car = new Car(this.car.getModel());

		return cloned;
	}

	public Member getMember() {
		Member cloned = null;

		try {
			cloned = (Member) clone();//재정의된 clone()메소드를 호출
		} catch (CloneNotSupportedException e) {

		}

		return cloned;
	}
}
