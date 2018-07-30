public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish("Chicken Alfredo", 650, true);

        System.out.println(dish.getNameOfDish());
        System.out.println(dish.getCostInCents());
        System.out.println(dish.getWouldRecommend());
        dish.eat();
        dish.setNameOfDish("Crepes");
        dish.setCostInCents(4567);
        dish.setWouldRecommend(false);
        System.out.println(dish.getNameOfDish());
        System.out.println(dish.getCostInCents());
        System.out.println(dish.getWouldRecommend());
    }
}
