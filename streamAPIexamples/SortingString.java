package streamAPIexamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingString {

	public static void main(String[] args) {

		List<String> abc = Arrays.asList("A", "AAA", "BB", "BBBBB", "AAAAAA");

		if (abc != null) {

			Comparator<String> c = (a, b) -> {
				int l1 = a.length();
				int l2 = b.length();
				if (l1 < l2)
					return -1;
				else if (l1 > l2)
					return 1;
				else
					return 0;
			};

			List<String> sort = abc.stream().sorted(c).toList();

			System.out.println(sort);

			List<String> sortedlist = abc.stream().sorted((a, b) -> Integer.compare(a.length(), b.length())).toList();

			System.out.println(sortedlist);

			List<String> sorted = abc.stream().sorted(Comparator.comparingInt(String::length)).toList();

			System.out.println(sorted);

		}
	}

}
