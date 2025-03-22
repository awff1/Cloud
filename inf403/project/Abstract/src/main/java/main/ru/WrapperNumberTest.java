package main.ru;

public class WrapperNumberTest {
    public static void main(String[] args) {
    Integer i = 10;

    Integer a = 10;
    Integer b = 20;

    a++;
    System.out.println(a.getClass());

    int c = a + b;

    Integer d = c * 20;
    d = func3(d);//1. распаковка 2. упаковка результата функции в класс обертку
    System.out.println(d);
    }

    public static Integer func1(int a) {
        return a + 1; // упаковка
    }
    public static Integer func2(Integer a) {
        return  a + 1;// 1. распаковка 2. сложение 3. упаковка
    }
    public static int func3(int a) {
        return a + 1;
    }
}
