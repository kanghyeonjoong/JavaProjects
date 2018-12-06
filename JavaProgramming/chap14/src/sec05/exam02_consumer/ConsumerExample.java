package sec05.exam02_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		/*
		 * Consumer 함수적 인터페이스 : 매개값은 있고 리턴값이 없는 accept( ) 추상 메소드를 가진다.
		 * accept()메소드는 단지 매개값을 소비하는 역할을 한다. 소비한다는 말은 사용할 뿐 리턴값이 없다는 뜻이다.
		 * 매개값->XXXConsumer
		 */

		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");

		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
		biConsumer.accept("Java", "8");

		DoubleConsumer doubleComsumer = d -> System.out.println("Java" + d);
		doubleComsumer.accept(8.0);

		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("Java", 8);

	}

}
