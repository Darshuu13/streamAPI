//In the given list double the values in it using map function

package streamAPIexamples;

import java.util.Arrays;
import java.util.List;

public class DoubleListValues {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 10, 15, 35, 20, 80);
		if (list != null) {
			List<Integer> doubledSize = list.stream().map(i -> i * 2).toList();

			System.out.println(doubledSize);
		}
	}
}
