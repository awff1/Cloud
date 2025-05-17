public class Task1 {
    public static void main(String[] args) {
        int[] answer = bs(new int[] {0, 1, 2, 2, 2, 2, 2, 3, 4, 5}, 2);
        System.out.println(answer[0] + " " + answer[1]);
    }
    public static int[] bs(int[] x, int y) {
        int[] answer = new int[2];
        int l = 0;
        int r = x.length - 1;
        int m;
        while(l <= r) {
            m = (l+r)/2;
            if (x[m] < y) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        answer[0] = l;
        l = 0;
        r = x.length - 1;
        while(l <= r) {
            m = (l+r)/2;
            if (x[m] <= y) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        answer[1] = l - 1;
        return answer;
    }
}
