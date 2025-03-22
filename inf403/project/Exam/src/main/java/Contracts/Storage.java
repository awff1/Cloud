package Contracts;

public class Storage {
    private Integer CAPACITY = 100;
    protected Integer storageSize = 0;
    protected Contract[] contracts = new Contract[CAPACITY];


    public void add(Contract contract) {
        contracts[storageSize] = contract;
        storageSize++;
    }

    public void storageInfo() {
        for(Contract contract : contracts) {
            contract.printInfo();
        }
    }
}
