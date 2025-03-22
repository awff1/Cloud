package Contracts;

public class dotaContract extends Contract {
    protected String role;
    protected Integer mmr;

    dotaContract(Integer price, Integer duration, String role, Integer mmr) {
        super(price, duration);
        this.role = role;
        this.mmr = mmr;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("pos: " + role);
        System.out.println("rating: " + mmr);
    }
}
