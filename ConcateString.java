package java8.interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcateString {
	public static void main(String[]args) {
		List<String> strList= Arrays.asList("abc","def","ghi");
	String resultString=	strList.stream().collect(Collectors.joining());
	System.out.println("Concatenation of String :: "+ resultString);
		
	}

}
