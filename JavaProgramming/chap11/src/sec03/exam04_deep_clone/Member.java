package sec03.exam04_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable {
	private String name;
	private int age;
	
	//���� Ÿ�� �ʵ�(���� ������ ���)
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

	//���� ����(thin clone)�� ��� ���� Ÿ�� �ʵ�� ������ �����Ǳ� ������ ���� ��ü�� �ʵ�� ���� ��ü�� �ʵ��
	//���� ��ü�� �����ϰ� �ȴ�. ���� ���� ��ü���� ���� ��ü�� �����ϸ� ���� ��ü�� ����� ��ü�� ������ �ȴ�.
	//���� ����(deep clone)�� �����ϰ� �ִ� ��ü�� �����ϴ� ���� ���Ѵ�. ���� ������ �Ϸ��� Object�� clone()�޼ҵ带
	//�������ؼ� ���� ��ü�� �����ϴ� �ڵ带 ���� �ۼ��ؾ��Ѵ�.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// ���� ���� ���縦 �ؼ� name, age�� �����Ѵ�.
		Member cloned = (Member) super.clone();//Object�� clone()ȣ��

		// scores�� ���� �����Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);

		// car�� ���� �����Ѵ�.
		cloned.car = new Car(this.car.getModel());

		return cloned;
	}

	public Member getMember() {
		Member cloned = null;

		try {
			cloned = (Member) clone();//�����ǵ� clone()�޼ҵ带 ȣ��
		} catch (CloneNotSupportedException e) {

		}

		return cloned;
	}
}
