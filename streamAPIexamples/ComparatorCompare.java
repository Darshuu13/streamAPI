package streamAPIexamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorCompare {

	public static void main(String[] args) {

		List<Integer> marks = Arrays.asList(5, 10, 15, 35, 20, 80, 45, 17, 62, 39);

		if (marks != null) {
			// sorted list according to descending order using ternary operators
			List<Integer> sortedDescendingList = marks.stream().sorted((a, b) -> (a < b) ? 1 : (a > b) ? -1 : 0)
					.toList();

			// sorting using compare To method
			List<Integer> sortedlist = marks.stream().sorted((a, b) -> b.compareTo(a)).toList();

			// using comparator method
			List<Integer> sortlist = marks.stream().sorted(Comparator.reverseOrder()).toList();

			System.out.println("List of passed Students using normal sorting:" + sortedDescendingList
					+ " List of passed Students using compareTo method:" + sortedlist
					+ " List of passed Students using Comparator inbuild method:" + sortlist);

		}

	}

}
