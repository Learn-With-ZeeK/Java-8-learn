package com.java.stream.api.example;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	public static List<Employee> getEmployees() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "ZeeK", "IT", 600000));
		list.add(new Employee(2, "PV Maam", "Senior IT", 900000));
		list.add(new Employee(3, "Sandeep", "IT", 500000));
		list.add(new Employee(4, "Sourav", "Coding", 400000));
		list.add(new Employee(5, "Manish", "HR", 1200000));
		return list;
	}

}
