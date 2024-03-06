//sort the given list

package streamAPIexamples;

import java.util.Arrays;
import java.util.List;

public class SortMarks {

	public static void main(String[] args) {

		List<Integer> marks = Arrays.asList(5, 10, 15, 35, 20, 80, 45, 17, 62, 39);

		if (marks != null) {

			List<Integer> sortedList = marks.stream().sorted().toList();

			System.out.println("List of passed Students:" + sortedList);
		}

	}

}
