package java8.interview.questions;

import java.util.Arrays;
import java.util.List;

public class IntegerSum {
	
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(3,7,1,4);
		int sum=numList.stream().reduce(0, Integer::sum);
		System.out.println("Sum of integers :: "+ sum);
	}

}
