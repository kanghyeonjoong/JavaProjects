package sec03.exam01_multi_generic_type_parameter;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();

		/* 타입 파라미터 부분에 <>연산자를 사용하면 타입 파라미터를 유추해서 자동으로 설정해준다. */
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}

}
