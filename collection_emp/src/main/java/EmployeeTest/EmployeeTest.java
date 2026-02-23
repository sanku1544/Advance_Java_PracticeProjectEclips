package EmployeeTest;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.tka.Comparator.IdComp;
import com.tka.Controller.Controller;
import com.tka.Entity.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Controller c1= new Controller();
		
		//AllEmployess
		List<Employee> allEmployees=c1.getAllEmployess();
		allEmployees.forEach(System.out::println);
		
		//filter by role
		System.out.println("-------------------------------------------------------------------------");
		String role="Developer";
		List<Employee> tester=c1.getTesters(role);
		tester.forEach(System.out::println);
		
		//filter by role and salary
		System.out.println("-------------------------------------------------------------------------");
		String role1="Developer";
		int sal=20000;
		List<Employee> emp=c1.getByRoleSalary(role1,sal);
		emp.forEach(System.out::println);
		
		
		//update salary
		System.out.println("-------------------------------------------------------------------------");
		List<Employee> elist=c1.updateSalary();
		elist.forEach(System.out::println);
		
		//sort employees
		System.out.println("-------------------------------------------------------------------------");
		Comparator<Employee> e1= new IdComp<Employee>();
		Collections.sort(allEmployees,e1);
		allEmployees.forEach(System.out::println);
		
		
		
		
	}

}
