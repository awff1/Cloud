import java.util.Comparator;

public class List403Impl<T> implements List403 {
    private Object[] values;
    private int size;

    public List403Impl(){
        this.values = new Object[10];
        this.size = 0;
    }
    public void add(Object element){
        if (size >= values.length) {
            grow();
        }
        values[size++] = element;

    }
    public void add(Object element, int position) throws IndexOutOfBoundsException{
        if (position > size || position < 0){
            throw new IndexOutOfBoundsException();
        }
        if (size == values.length) {
            grow();
        }
        for (int i = size; i != position; i--) {
            values[i] = values[i-1];
        }
        values[position] = element;
        size++;
    }
    public Object remove(int position) throws IndexOutOfBoundsException{
        if (position > size-1 || position < 0){
            throw new IndexOutOfBoundsException();
        }
        Object temp = values[position];
        for (int i = position; i < size - 1 ; i++) {
            values[i] = values[i + 1];
        }
        size--;
        return temp;

    }
    public Object get(int position) throws IndexOutOfBoundsException{
        if (position > size-1 || position < 0){
            throw new IndexOutOfBoundsException();
        }
        return values[position];
    }
    public int size(){
        return size;
    }

    private void grow() {
        Object[] newValues = new Object[(int) (size*1.5)];
        for (int i = 0; i < size; i++) {
            newValues[i] = values[i];
        }
        values = newValues;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < size; ++i) {
            stringBuilder.append(values[i]).append(" ");
        }

        return stringBuilder.toString();
    }

    public void sort(Comparator comparator) {

    }

}
