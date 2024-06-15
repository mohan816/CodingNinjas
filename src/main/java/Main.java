import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream.of(1,2,3)
		.forEach((n) -> printNumber(n));
  
	}
	public static void printNumber(int n) {
		System.out.println(n);
	}

}
