package streamAPIexamples;

import java.util.stream.Stream;

public class Streamof {

	public static void main(String[] args) {

		Stream<?> item = Stream.of(88, 5, 0, 1, 66, 55, 4, "DD", 88, "yes");

		item.forEach(System.out::println);
	}

}
