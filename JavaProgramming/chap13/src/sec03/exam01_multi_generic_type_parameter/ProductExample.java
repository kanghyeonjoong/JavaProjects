package sec03.exam01_multi_generic_type_parameter;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("����ƮTV");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();

		/* Ÿ�� �Ķ���� �κп� <>�����ڸ� ����ϸ� Ÿ�� �Ķ���͸� �����ؼ� �ڵ����� �������ش�. */
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("����");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}

}