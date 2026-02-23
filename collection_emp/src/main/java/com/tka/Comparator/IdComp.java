package com.tka.Comparator;

import java.util.Comparator;

import com.tka.Entity.Employee;

public class IdComp<T> implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return new Integer(o1.getId()).compareTo(new Integer(o2.getId()));
	}


	
	
	
}
