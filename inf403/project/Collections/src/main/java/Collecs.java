import java.util.Arrays;
public class Collecs implements Icollections {

    private int size;
    private final int CAPACITY = 10;
    Integer[] list;

    public Collecs() {
        this.list = new Integer[CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(Integer element) {
        if (size >= list.length) {
            grow();
        }
        list[size++] = element;
    }

    @Override
    public void add(Integer element, int position) {
        if (position > size - 1 || position < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (size == list.length) {
            grow();
        }
        for (int i = size; i != position; i--) {
            list[i] = list[i-1];
        }
        list[position] = element;
        size++;
    }

    @Override
    public Integer remove(int position) {
        if (position > size - 1 || position < 0) {
            throw new IndexOutOfBoundsException();
        }
        Integer temp = list[position];
        for (int i = position; i < size - 1; i++) {
            list[i] = list[i+1];
        }
        size--;
        return temp;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Integer get(int position) {
        if (position > size - 1 || position < 0) {
            throw new IndexOutOfBoundsException();
        }
        return list[position];

    }


    public Integer[] sort() {
        Integer[] res = new Integer[size];
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (list[j] > list[i]) {
                    temp = list[j];
                }
            }
            res[i] = temp;
        }
        return res;
    }

    private void grow() {
        Integer[] tempList = new Integer[(int) (size * 1.5)];
        for (int i = 0; i < size; i++) {
            tempList[i] = list[i];
        }
        list = tempList;
    }
    public String toString() {
        String str = Arrays.toString(list);
        return str;
    }
}
