//Create a class of static properties and methods called BurgerTools
//
//   Include a string property of mostPopularTopping
//   Include an int property of averageDaysBeforeExpiration
//   Include an int property of temperatureWhenCooked
//   Include a void method called grill() that prints out "Grilling burger"
//
// Create a class called BurgerTester to test assigning and printing property values
// and testing methods.
//
// If you have time, add additional properties and methods.
public class BurgerTools {

    private String mostPopularTopping;
    private int averageDaysBeforeExpiration;
    private int temperatureWhenCooked;

    public void grill() {
        System.out.println("Grilling burger");
    }

    public void setMostPopularTopping(String input) {
        this.mostPopularTopping = input;
    }

    public void setAverageDaysBeforeExpiration(int input) {
        this.averageDaysBeforeExpiration = input;
    }

    public void setTemperatureWhenCooked(int input) {
        this.temperatureWhenCooked = input;
    }

    public String getMostPopularTopping() {
        return mostPopularTopping;
    }

    public int getAverageDaysBeforeExpiration() {
        return averageDaysBeforeExpiration;
    }

    public int getTemperatureWhenCooked() {
        return temperatureWhenCooked;
    }
}
