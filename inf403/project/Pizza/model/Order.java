package Pizza.model;

public class Order {
    private int number;
    private Client client;
    private String orderTime;
    private Pizza[] pizzas;
    private float cost;
    private int discount;
    private float summ;


    public Order() {}

    public Order(int number, Client client, String orderTime, Pizza[] pizzas, float cost, int discount, float summ) {
        this.number = number;
        this.client = client;
        this.orderTime = orderTime;
        this.pizzas = pizzas;
        this.cost = cost;
        this.discount = discount;
        this.summ = summ;
    }

    public int getNumber() {
        return number;
    }

    public Client getClient() {
        return client;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public float getCost() {
        return cost;
    }

    public int getDiscount() {
        return discount;
    }

    public float getSumm() {
        return summ;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public void setSumm(float summ) {
        this.summ = summ;
    }

    public float getCost() {
        float cost = 0;
        for (int i = 0; i < pizzas.length; i++) {
            cost += pizzas[i].getPrice();
        }
        return cost;
    }

    public int getDiscount() {
        return  client.getProc();
    }

    public  float getSumm() {
        float summ = 0;
        return getCost() - getDiscount() * getCost() / 100;
    }
}
