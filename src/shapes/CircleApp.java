package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        boolean again;
        do {
            double radius = input.getDouble("What is the radius of the circle?");
            Circle circle = new Circle(radius);
            System.out.println("Circumference = " + circle.getCircumference());
            System.out.println("Area = " + circle.getArea());
            circle.circlesCreated();
            again = input.yesNo("Would you like to make another circle?");
        } while (again);
        System.out.println("Total circles created: " + Circle.getCount());
    }
}