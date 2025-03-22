package Contracts;

public class csContract extends Contract {
    protected Integer level;

    csContract(Integer price, Integer duration, Integer level) {
        super(price, duration);
        this.level = level;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Faceit level: " + level);
    }
}
