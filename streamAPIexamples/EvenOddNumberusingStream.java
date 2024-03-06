//Find the even odd number from the list using stream API and filter.

package streamAPIexamples;

import java.util.Arrays;
import java.util.List;

public class EvenOddNumberusingStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 10, 15, 35, 20, 80);

		if (list != null) {
			List<Integer> evenNumbers = list.stream().filter(i -> i % 2 == 0).toList();

			List<Integer> oddNumbers = list.stream().filter(i -> i % 2 != 0).toList();

			System.out.println("Even Numbers:-" + evenNumbers);
			System.out.println("Odd Numbers:-" + oddNumbers);
		}
	}

}
