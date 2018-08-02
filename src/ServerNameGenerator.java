public class ServerNameGenerator {

    private static String[] adjectives = {"scared", "medical", "emotional", "political", "suspicious", "tiny", "competitive", "unlikely", "responsible", "cute"};
    private static String[] nouns = {"scene", "market", "instance", "garbage", "description", "lab", "property", "volume", "guitar", "analyst"};

    private static String randomElement(String[] input) {
        return input[(int) Math.floor(Math.random() * 10 + 1)];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:\n" + randomElement(adjectives) + "-" + randomElement(nouns));
    }
}
