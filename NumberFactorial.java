package java8.interview.questions;

import java.util.stream.IntStream;

public class NumberFactorial {

	public static void main(String[]args) {
		int num= 5;
		int fatcorial = IntStream.rangeClosed(1, num).reduce(1, (a,b)->a*b);
		System.out.println("Factorial of a given number :: "+ fatcorial);
	}
}
