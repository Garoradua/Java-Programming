import java.util.*;
import java.util.stream.Collectors;
class Employee{
	String name;
	int salary;
	int id;

	public Employee(String name, int salary, int id ){
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
}
public class streamAAPPII{
	public static void main(String[] args){
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Gourav",120000,20));
		empList.add(new Employee( "Gourav123",20000,21));
		empList.add(new Employee( "Gourav456",80000,24));

	List<String> newList = empList.stream().filter(s->s.salary > 50000).map(n ->n.name).collect(Collectors.toList());
	System.out.println(newList);
	}
}