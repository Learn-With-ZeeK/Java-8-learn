package com.java.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		
		Consumer<Integer> consumer = t -> System.out.println("Printing  : " + t);
		
		//Will print  Printing:10
		consumer.accept(10);
		 

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		
		//Will print each value of array as print:1 , print:2 ,etc
        list1.stream().forEach(t -> System.out.println("print  : " + t));

	}
}
