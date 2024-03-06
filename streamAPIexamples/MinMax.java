package streamAPIexamples;

import java.util.Arrays;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 90, 80, 66, 34, 55);

		if (list != null) {

			Integer maxString = list.stream().max((a, b) -> Integer.compare(a, b)).get();

			Integer max = list.stream().max(Integer::compare).get();

			System.out.println(maxString);
			System.out.println(max);

		}

	}

}
