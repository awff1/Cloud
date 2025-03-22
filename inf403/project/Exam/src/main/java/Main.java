public class Main {

    public static void in(int x) {
        x+=1;
    }
    public static void main(String[] args){
        int count = 0;
        int[] a =new int[]{1,2,3,4,5,6,7,8,9};
        for(int el : a) {
            if (el > 5) {
                count++;
//                System.out.println(el);
            }
        }

        System.out.println(count);
    }

}

