public class Main {
    public static void main(String[] args) {
        Collecs collecs1 = new Collecs();
        collecs1.add(1);
        collecs1.add(9);
        collecs1.add(4);
        collecs1.add(2);
        collecs1.add(7);
        System.out.println(collecs1);
        collecs1.sort();
        System.out.println(collecs1);
    }
}
