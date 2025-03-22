package main.ru;

public class Main {
    public static void main(String[] args) {
        CalculateIntegralLeft calculateIntegralLeft = new CalculateIntegralLeft(0,Math.PI/2, new Sinus());
        System.out.println(calculateIntegralLeft.get());
    }
}
