package abhay.java8.stream;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println("inside my consumer " + t);

	}

}
