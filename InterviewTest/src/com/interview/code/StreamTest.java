package com.interview.code;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		
		Map<Integer, String> str = new HashMap<>();
		str.put(1, "mani");
		str.put(2, "moxi");
		str.put(3, "abcd");
		str.put(null, null);
		str.put(null, null);
		
		/*
		List<String> isbnCodes = str.entrySet().stream()
		.filter(i -> i.getValue().startsWith("abcd"))
		.map(Map.Entry::getValue)
		.collect(Collectors.toList());
		//.findFirst();
		
		System.out.println(isbnCodes);
		*/
		
		//prints the map vales
		str.entrySet().stream()
		.forEach(e -> System.out.println(e.getValue()));
		
		
		// Stores the values in a list which can later used
		List<String> collect = str.values().stream().collect(Collectors.toList());
		System.out.println(collect); // [null, mani, moxi, abcd]
		
		
		
		
	}

}
