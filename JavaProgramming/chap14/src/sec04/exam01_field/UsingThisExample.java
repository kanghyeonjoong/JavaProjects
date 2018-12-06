package sec04.exam01_field;

public class UsingThisExample {

	public static void main(String[] args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();

		UsingThis.Inner inner2= (new UsingThis()).new Inner();
		inner2.method();
	}

}
