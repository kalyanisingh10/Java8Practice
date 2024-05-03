package java8.interview.questions;

import java.util.Arrays;
import java.util.List;

public class AverageLengthOfString {
	
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Sample","Testing");
		Double averageLength=strList.stream().mapToInt(String :: length).average().orElse(0.0);
		System.out.println("Averagae length of the string :: "+ averageLength);
	}

}
