package com.curso.v0;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Principal4 {

	public static void main(String[] args) {

		List<String> list = List.of("monkey", "2", "chimp"); 
		
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		
		System.out.println(list.stream().anyMatch(pred)); //true
		
		System.out.println(list.stream().allMatch(pred)); //false
		
		System.out.println(list.stream().noneMatch(pred)); //false
		
		
		Stream<String> infinite = Stream.generate(() -> "chimp"); 
		
		System.out.println(infinite.anyMatch(pred)); // true
	}

}
