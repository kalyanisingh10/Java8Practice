package java8.interview.questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NthHighSalaryOfEmployee {

	public static void main(String[] args) {
		List<EmployeeData> al = new ArrayList<EmployeeData>();

		al.add(new EmployeeData(1, "Amanda", 30000, "IT"));
		al.add(new EmployeeData(2, "Berlin", 35000, "HR"));
		al.add(new EmployeeData(3, "Caroline", 40000, "IT"));
		al.add(new EmployeeData(4, "Damodar", 20000, "HR"));
		// Finding second highest salary from the list
		//This approach has drawback when two employees has same second highest salary
		List<EmployeeData> sortedList = (List<EmployeeData>) al.stream()
				.sorted(Comparator.comparing(EmployeeData::getSalary).reversed()).collect(Collectors.toList());
		System.out.println("Printing the second highest salary of an employee");
		sortedList.forEach(System.out::println);
		System.out.println(sortedList.get(1));

		// Filter list of employee whose salary >20000 and dept is IT and Adding 1000 to the  filtered list of employee

		List<EmployeeData> filteredList = al.stream()
				.filter(e -> (e.getSalary() > 20000) && ("IT").equalsIgnoreCase(e.getDept()))
				.peek(e -> e.setSalary(e.getSalary()+1000)).collect(Collectors.toList());
		System.out.println("List of employees whose salary is greater than 20000 and departmane is IT");
		filteredList.forEach(System.out::println);

		

	}

}
