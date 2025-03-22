public class Bubble {
	public static void main(String args[]) {
		int array[] = {3,2,1,5,7,9};
		System.out.println(sort(array));
		int res[] = sort(array);
		for(int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

	private static int[] sort(int[] a) {
		for(int i = 0; i < a.length-1; i++) {
			for(int j = 0; j < a.length-1; j++) {
				if (compare(a[j], a[j+1]) == 1) {
					swap(a, j, j+1);
				}
			}
		}
		return a;
	}	

	private static int compare(int x, int y) {
		if (x > y) {
			return 1;
		}else {
			return 0;
		}
	}

	private static int[] swap(int[] a, int x, int y) {
		 int bol = a[x];
		 int men = a[y];
		 a[x] = men;
		 a[y] = bol;
		 return a;
	}
}
