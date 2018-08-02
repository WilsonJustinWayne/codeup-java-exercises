package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape;
        myShape = new Square(5);
        System.out.println(myShape.getArea() + ", " + myShape.getPerimeter());
        myShape = new Rectangle(4, 5);
        System.out.println(myShape.getArea() + ", " + myShape.getPerimeter());
    }
}
