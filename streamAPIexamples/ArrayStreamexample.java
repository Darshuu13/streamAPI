package streamAPIexamples;

import java.util.Arrays;

public class ArrayStreamexample {

	public static void main(String[] args) {

		Integer[] arr = { 7, 55, 10, 95, 63, 22, 8, 4, 20, 45, 77 };

		if (arr != null) {

			Arrays.stream(arr).sorted().filter(i -> i % 2 == 0).forEach(System.out::println);
		}

	}
}