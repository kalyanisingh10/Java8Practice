package java8.interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyInString {
	
	//Program to count frequency of a character in a string
	public static void main(String[] args) {
		String str="Banana";
		 Map<Object, Long> res=Arrays.stream(str.split("")).collect(Collectors.groupingBy(e->e,Collectors.counting()));
	System.out.println(res);
	}

}
