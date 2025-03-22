public class Test5 {
    public static void main(String[] args) {
        int[] a = new int[]{5,1,3,2,4};
        System.out.println(a[1]);
        a[1] = a[2];
        System.out.println(a[1]);
        int [] c = a;
        if (c[1] > a[2]) {
            c[1] = 0;
        } else {
            a[3] = 1;
        }
        a[2] = 4;
        System.out.println(a[1] - c[1] - a[2] +c[2] + "" + c[3] + a[1]);
    }
}
