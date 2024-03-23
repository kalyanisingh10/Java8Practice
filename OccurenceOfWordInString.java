package java8.interview.questions;

import java.util.Arrays;


public class OccurenceOfWordInString {
	
	public static void main(String[]args) {
		String inputString= "Here is an example. Right here.";
		String testSteing ="here";
		if(!inputString.isEmpty()) {
			
	Long stringContainCount =	Arrays.stream(inputString.replaceAll("\\.", " ").split(" ")).filter(s-> s.equalsIgnoreCase(testSteing)).count();
	System.out.println("Occurence of word :: "+ stringContainCount);
		}else {
			System.out.println("String should not be empty");
		}
				
	}

}
