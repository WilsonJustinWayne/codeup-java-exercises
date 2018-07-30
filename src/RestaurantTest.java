public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.nameOfDish = "Chicken Alfredo";
        dish.costInCents = 650;
        dish.wouldReccomend = true;

        System.out.println(dish.nameOfDish);
        System.out.println(dish.costInCents);
        System.out.println(dish.wouldReccomend);
        dish.eat();
    }
}
