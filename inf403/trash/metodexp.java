public class metodexp {
	public static void main(String args[]) {
		System.out.println(eps(1));
	}
	public static int abs (int x) {
		if (x < 0) {
			x*= -1;
			return x;
		} else {
			return x;
		}
	}
	public static double eps (double x) {
		double res = 1;
		double xPow = 1;
		int i = 1;
		double f = 1;
		while (((xPow/f) > 0.000001) || ((xPow/f) < -0.000001)) {
			xPow = xPow * x;
			res = res + (xPow/f);
			i++;
			f = f * i;
		return res;
	}

}
while(z > 0) {
	
}