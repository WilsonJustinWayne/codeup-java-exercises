//1) Change your public properties in your RestaurantDish class to private
// 2) Add getters and setters for these properties (use IntelliJ to do this quickly)
// 3) Refactor code used in RestaurantTest to set and print these property values...
//     ...to use your getters and setters
// 4) Add a constructor method to RestaurantDish that will assign property...
//   ...values based on arguments passed into the constructor
public class RestaurantDish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public RestaurantDish(String nameOfDish, int costInCents, boolean wouldRecommend) {
        this.nameOfDish = nameOfDish;
        this.costInCents = costInCents;
        this.wouldRecommend = wouldRecommend;
    }
    public void eat() {
        System.out.println("Nom nom nom!");
    }

    public void setCostInCents(int input) {
        this.costInCents = input;
    }

    public void setNameOfDish(String input) {
        this.nameOfDish = input;
    }

    public void setWouldRecommend(boolean input) {
        this.wouldRecommend = input;
    }

    public int getCostInCents() {
        return this.costInCents;
    }

    public String getNameOfDish() {
        return this.nameOfDish;
    }

    public boolean getWouldRecommend() {
        return this.wouldRecommend;
    }
}
