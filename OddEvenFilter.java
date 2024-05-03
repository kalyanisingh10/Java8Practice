package java8.interview.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenFilter {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(3);
		numList.add(6);
		numList.add(7);
		numList.add(21);
	List<Integer> evenList=	numList.stream().filter(x->x%2==0).collect(Collectors.toList());
	System.out.println("Event List ::"+ evenList);
	List<Integer> oddList = numList.stream().filter(x->x%2!=0).collect(Collectors.toList());
	System.out.println("Odd List ::" + oddList);
		}

}
