package Pizza.model;

public class Client {
    private String name;
    private int proc;

    public Client() {}


    public Client(String name, int discount) {
        this.name = name;
        this.proc = discount;
    }

    public String getName() {
        return this.name;
    }

    public int getProc() {
        return this.proc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProc(int proc) {
        this.proc = proc;
    }
}
