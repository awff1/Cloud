package Contracts;

public class Contract {
    protected Integer price;
    protected Integer duration;

    Contract(Integer price, Integer duration) {
        this.price = price;
        this.duration = duration;
    }

    public void printInfo() {
        System.out.println("price: " + price);
        System.out.println("duration: " + duration + " days" );
    }
}
