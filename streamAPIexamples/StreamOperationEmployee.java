package streamAPIexamples;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamOperationEmployee {

	public static void main(String[] args) {
		
		List<Employee> emplist=new ArrayList<>();
		
		
		emplist.add(new Employee("Darshan",50000.0,"M"));
		emplist.add(new Employee("Komal",90000.0,"F"));
		emplist.add(new Employee("Radhika",80000.0,"F"));
		emplist.add(new Employee("Abhi",30000.0,"M"));
		emplist.add(new Employee("Raghav",10000.0,"M"));

		System.out.println(emplist);
		
	//	Employee maxsalary=emplist.stream().max((a,b)-> Double.compare(a.getSalary(), b.getSalary())).get();
		Employee maxsalary=emplist.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();

		System.out.println(maxsalary);
		
		
		Employee secondHighestSalary=emplist.stream().sorted((a,b)-> Double.compare(b.getSalary(), a.getSalary())).skip(1).findFirst().get();
		System.out.println(secondHighestSalary);
		
		
		Map<String,Long> findGender =emplist.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(findGender);

	}

}
 