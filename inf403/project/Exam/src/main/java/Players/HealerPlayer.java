package Players;

public class HealerPlayer extends Player {
    private int healPoints;

    public HealerPlayer(String name, Integer damage, int healPoints) {
        super(name, damage);
        this.healPoints = healPoints;
    }

    public void heal() {
        hp+=healPoints;
    }
}

