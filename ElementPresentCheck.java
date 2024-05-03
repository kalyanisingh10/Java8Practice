package java8.interview.questions;

import java.util.Arrays;
import java.util.List;

public class ElementPresentCheck {
	
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(7,6,21,45);
		Integer num = 21;
		boolean isPresent=numList.stream().anyMatch(n -> num.equals(n));
		
		System.out.println("Element is present ::"+isPresent);
	}

}
