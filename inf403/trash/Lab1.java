public class Lab1 {
	public static void main(String args[]) {
		int x[] = {1,2,3,4};
		int max = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < x.length; j++) {
				if (x[j] > i) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}

	}
}
