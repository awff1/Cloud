public class Test4 {
    public static void main(String[] args) {

        int n = 5;


        System.out.print('0');
        for (int i = 0; i < n - 2; ++i) {
            System.out.print(' ');
        }
        System.out.println('0');


        for (int i = 0; i < n/2 -1; ++i) {
            System.out.print('0');
            for (int j = 0; j < i; ++j) {
                System.out.print(' ');
            }
            System.out.print('0');
            for (int j = 0; j < n - 4 - 2*i; ++j) {
                System.out.print(' ');
            }
            System.out.print('0');
            for (int j = 0; j < i; ++j) {
                System.out.print(' ');
            }
            System.out.println('0');
        }
        if (n%2 == 1) {
            System.out.print('0');
            for (int j = 0; j < (n-3)/2; j++) {
                System.out.print(' ');
            }
            System.out.print('0');
            for (int j = 0; j < (n-3)/2; j++) {
                System.out.print(' ');
            }
            System.out.println('0');
        }
        for (int i = n/2-2; i > -1; --i) {
            System.out.print('0');
            for (int j = 0; j < i; ++j) {
                System.out.print(' ');
            }
            System.out.print('0');
            for (int j = 0; j < n - 4 - 2*i; ++j) {
                System.out.print(' ');
            }
            System.out.print('0');
            for (int j = 0; j < i; ++j) {
                System.out.print(' ');
            }
            System.out.println('0');
        }
        System.out.print('0');
        for (int i = 0; i < n - 2; ++i) {
            System.out.print(' ');
        }
        System.out.println('0');

    }
}