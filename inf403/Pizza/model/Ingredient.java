package Pizza.model;

public  class Ingredient {
    private String name;
    private int ccal;


    public Ingredient() {}

    public Ingredient(String name, int ccal) {
        this.name = name;
        this.ccal = ccal;
    }

    public String getName() {
        return name;
    }

    public String getName(boolean toUpper) {
//        if toUpper {
//            return name.toUpperCase()
//        } else {
//            return name
//        }
        return toUpper ? name.toUpperCase() : name;
    }

    public int getCcal() {
        return ccal;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCcal(int ccal) {
        this.ccal = ccal;
    }
}