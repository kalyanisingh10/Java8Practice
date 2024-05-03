package java8.interview.questions;

import java.util.Arrays;
import java.util.List;

public class OccurenceOfChar {
	
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("banana","apple");
		char targetChar ='a';
	Long count=	strList.stream().flatMapToInt(CharSequence :: chars).filter(c-> c==targetChar).count();
	System.out.println("Count of target character :: "+ count);
	}

}
