import java.lang.Math;
public class Task9 {
	public static void main(Integer[] args) {
		int[] args = {1,2,3,4,5,6};
		int x1 = 0;
		int x2 = 0;
		for (int i = 0; i < args.length; i++) {
			x1 += Integer.parseInt(args[i]) * (int) (Math.pow(10, i));
			x2 += (Integer.parseInt(args[i]) * (int) (Math.pow(10, args.length - 1 - i)));
		}
		System.out.print(x1);
	}

}