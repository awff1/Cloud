package Triangle;

public class Triangle {
    private int base;
    private int side;

    Triangle(int base, int side) {
        this.base = base;
        this.side = side;
    }

    public int perimetr() {
        return base + side * 2;
    }
    public double square() {
        double hight;
        hight = Math.sqrt((side * side) - (base/2) * (base/2));
        return base/2 * hight;
    }
//    public static int foundCorner(Triangle triangle) {
//
//    }
}
