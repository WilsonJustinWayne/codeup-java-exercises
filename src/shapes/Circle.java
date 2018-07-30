package shapes;

public class Circle {
    private double radius;
    private static int count = 0;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public void circlesCreated() {
        this.count++;
    }
    public static int getCount() {
        return count;
    }
}