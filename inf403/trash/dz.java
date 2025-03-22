// public class dz{
// 	public static void main(String args[]){
// 		int b1 = 10;
// 		int c1 = 20;
// 		int ind = 2;
// 		int b2 = 5;
// 		int big = 20;
// 		//System.out.println((b1+ c1) % (++b2 / b1++));
// 		System.out.println((b1 < c1) && (b2 == -99) || (ind >=0));
// 		System.out.println((b1 | c1) & (big ^ b1));
// 		System.out.println((b1 << 3 + c1 << 2) % (b2 >> 5 / b1 >>> 2));
// 	}
// }
public class dz {
	public static void main(String args[]){
		double res = 1;
		double xPow = 1;
		double x = 1;
		int i = 1;
		double f = 1;
		while (((xPow/f) > 0.000001) || ((xPow/f) < -0.000001)) {
			xPow = xPow * x;
			res = res + (xPow/f);
			i++;
			f = f * i;
		}
		System.out.println(res);
	}
	// public static void main(String args[]){
	// 	for(int i = 0, j = 0; i + j < 100; i++, j+=2){
	// 		System.out.println("i= " + i + "," + "j= " + j);
	// 	}
	//}
}
