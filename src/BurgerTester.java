public class BurgerTester {
    public static void main(String[] args) {

        BurgerTools tool = new BurgerTools();
        tool.setMostPopularTopping("Tomato");
        tool.setAverageDaysBeforeExpiration(3);
        tool.setTemperatureWhenCooked(165);
        System.out.println(tool.getMostPopularTopping());
        System.out.println(tool.getAverageDaysBeforeExpiration());
        System.out.println(tool.getTemperatureWhenCooked());
        tool.grill();
    }
}
