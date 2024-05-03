package java8.interview.questions;

import java.util.Arrays;
import java.util.List;


public class SumOfEvenNum {
	
	public static void main(String[] args) {
		List<Integer> numList= Arrays.asList(4,1,7,2,9);
		Integer evenSum=numList.stream().filter(x->x%2==0).mapToInt(n-> n).sum();
		System.out.println("Sum of Even num :: "+ evenSum);
	}

}
