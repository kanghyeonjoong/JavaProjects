package sec02.exam02_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		System.out.println(str);

		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		System.out.println(box2.get());
	}

}
