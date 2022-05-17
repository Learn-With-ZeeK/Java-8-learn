package com.java.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java.stream.api.example.DataBase;
import com.java.stream.api.example.Employee;

public class SortListDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);

		List<Employee> employees = DataBase.getEmployees();
          Collections.sort(list); //ASCENDING ORDER
         
         Collections.reverse(list); //DESCENDING ORDER
   	
           System.out.println(list);
	
		
		Collections.sort(employees, ( o1,  o2) ->(int) (o1.getSalary() - o2.getSalary()));
		  System.out.println(employees);
	
	

	
	}
}
