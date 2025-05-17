public class PickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,24,6,2,34,13,66,100};
        int minEl = arr[0];
        int minIndex = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >= i; j--) {
                if (arr[j] < minEl) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int g = 0; g < arr.length; g++) {
            System.out.println(arr[g]);
        }
    }
}
