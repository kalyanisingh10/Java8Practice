package java8.interview.questions;

import java.util.Arrays;
import java.util.List;

public class ElementThresholdChecker {
	
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(10,20,30,40,50);
		Integer threshold = 5;
		boolean isGreaterThanThreshold=numList.stream().anyMatch(x->x>threshold);
		System.out.println("Greater than threshold :: "+ isGreaterThanThreshold);
	}

}
