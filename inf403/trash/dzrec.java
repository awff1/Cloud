import java.util.Scanner;
public class dzrec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int enter = in.nextInt();
		System.out.println(fibonacci(enter));
	}
	private static int factorial(int n) {
		if (n == 0) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}
	private static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}