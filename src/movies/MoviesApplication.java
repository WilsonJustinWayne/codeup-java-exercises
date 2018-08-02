package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    private static Input tool = new Input();
    private static Movie[] array = MoviesArray.findAll();


    public static void main(String[] args) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array[i].getName());
            System.out.println(array[i].getCategory());
        }
        boolean isKeepGoing = true;
        do {
            String prompt = "What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - add a new movie\n" +
                    "\n" +
                    "Enter your choice: ";
            int input = tool.getInt(0,6,prompt);
            switch (input) {
                case 0:
                    isKeepGoing = false;
                    break;
                case 1:
                    for (Movie movie : array) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                    break;
                case 2:
                    for (Movie movie : array) {
                        if (movie.getCategory().equalsIgnoreCase("animated")) {
                            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : array) {
                        if (movie.getCategory().equalsIgnoreCase("drama")) {
                            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : array) {
                        if (movie.getCategory().equalsIgnoreCase("horror")) {
                            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie movie : array) {
                        if (movie.getCategory().equalsIgnoreCase("scifi")) {
                            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                        }
                    }
                    break;
                case 6:
                    tool.getString("");
                    String name = tool.getString("Enter a movie title: ");
                    String category = tool.getString("Assign a category(animated, drama, horror, scifi): ");
                    Movie addMovie = new Movie(name, category);
                    Movie[] newArray = Arrays.copyOf(array, array.length);
                    newArray[newArray.length - 1] = addMovie;
                    array = newArray;
                    System.out.println(array[array.length - 1].getName());
                    break;
                default:
                    System.out.println("Improper Input, please enter one of the options");
                    break;
            }
        } while (isKeepGoing);
    }
}
