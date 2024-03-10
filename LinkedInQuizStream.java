import java.util.stream.Stream;

public class LinkedInQuizStream {
	
	public static void main(String[]args) {
		Stream<Integer> streamList= Stream.of(1,2,3,4,5);
		streamList.reduce((a,b)->a+b).ifPresent(System.out::print);
		
		//output: 15
	}

}
