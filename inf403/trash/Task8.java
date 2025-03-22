import java.util.Scanner;
import java.lang.Math;
public class Task8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите n:");
		int n = in.nextInt();
		if (n == 1) {
			System.out.println("1");
		}
		else if (n < 1) {
			System.out.println("n < 1");
		}
		else {
			int[] array = new int[n];
			array[0] = 1;
			array[1] = -3;
			for(int i = 2; i < n; i++) {
				if (i % 2 != 0) {
					array[i] = (Math.abs(array[i-1]) + 2) * (-1);
				} else {
					array[i] = Math.abs(array[i-1]) + 2;
				}
			}
		for(int i = 0; i < n; i++) {
				System.out.print(array[i] + " ");
			}
		}
	}
}