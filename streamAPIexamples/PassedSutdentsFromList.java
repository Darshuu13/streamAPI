//Find the list of students who have passed  also increase 5 marks of the failed student.

package streamAPIexamples;

import java.util.Arrays;
import java.util.List;

public class PassedSutdentsFromList {

	public static void main(String[] args) {

		List<Integer> marks = Arrays.asList(5, 10, 15, 35, 20, 80);

		if (marks != null) {

			List<Integer> passedStudents = marks.stream().filter(i -> i >= 35).toList();

			System.out.println("List of passed Students:" + passedStudents);
			List<Integer> graceMarks = marks.stream().filter(i -> i < 35).map(j -> j + 5).toList();

			System.out.println("Grace marks added list for Failed Students" + graceMarks);
		}

	}

}
