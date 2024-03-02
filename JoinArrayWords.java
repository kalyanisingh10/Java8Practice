package java8.interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinArrayWords {
//Program to join words in an array
	public static void main(String[] args) {
		List<String> worldList = Arrays.asList("Hellow","World","!");
		String resultString=worldList.stream().collect(Collectors.joining());
		System.out.println(resultString);
	}
}
