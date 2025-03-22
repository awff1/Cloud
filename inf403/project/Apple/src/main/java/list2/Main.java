package list2;

public class Main {
    public static void main(String[] args) {
        List2Direction list2 = new List2Direction();

        list2.add(new Apple("red", 50, "antonovka", 120));
        list2.add(new Apple("green", 79, "spatanovka", 113));
        list2.add(new Apple("yellow", 73, "golden", 200));
        list2.add(new Apple("green-yellow", 72, "gala", 100));
        list2.add(new Apple("very red", 120, "greny", 150));
        list2.add(new Apple("red", 90, "krasa", 100));

        list2.print();

        list2.add(3,new Apple("bloody", 80,"semerin", 70));

        list2.print();

        System.out.println(list2.pop());

        list2.print();

        System.out.println(list2.remove());

        list2.printReverse();

        list2.sort();

        list2.print();
    }
}
