package shapes;

public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side,side);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
