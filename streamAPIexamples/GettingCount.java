//Get the count of failed Students

package streamAPIexamples;

import java.util.Arrays;
import java.util.List;

public class GettingCount {

	public static void main(String[] args) {

		List<Integer> marks = Arrays.asList(5, 10, 15, 35, 20, 80);

		if (marks != null) {
			long failedStudentCount = marks.stream().filter(i -> i >= 35).count();

			System.out.println("List of failed Students: " + failedStudentCount);
		}

	}

}
