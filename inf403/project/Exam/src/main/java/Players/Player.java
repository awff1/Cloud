package Players;

public class Player {
    private String name;
    protected Integer hp = 100;
    private Integer damage;


    Player(String name, Integer damage) {
        this.name = name;
        this.damage = damage;
    }

    public void kick(Player victim) {
        victim.hp -= damage;
    }
    public String toString() {
        return name + ", " + "HP: " + hp;
    }
}
