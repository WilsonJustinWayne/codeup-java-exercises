// Create a command line grocery list maker...
//          - before prompting the user to enter each item, ask how many items will be entered
//          - for each item, the user should be prompted to enter in the name, quantity, and category of each grocery item
//          - be sure to create a GroceryItem class from which to instantiate GroceryItem objects to store in an array
//          - once the user has entered all items, print out all items grouped by category and alphabetized in each group

import util.Input;

import java.util.Arrays;

public class GroceryListMaker {
    private static void start() {
        System.out.println("------------------------------------------------");
        System.out.println("| Welcome to the Grocery List Creation Program |");
        System.out.println("------------------------------------------------");
    }

    private static String listTable(GroceryItem[] list) {
        for (GroceryItem item : list) {
            System.out.println(item.getName() + ", " + item.getCategory() + ", " + item.getQuantity());
        }
        return"";
    }

    public static void main(String[] args) {
        Input input = new Input();
        start();
        int numberOfItems = input.getInt("How many items will be on your list?");
        input.getString("");
        GroceryItem[] list = new GroceryItem[numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            list[i] = new GroceryItem(input.getString("Please enter the name of your Grocery Item.").toLowerCase(),
                    input.getString("Please enter the category of the item.").toUpperCase(),
                    input.getInt("Please enter the amount you wish to purchase."));
            input.getString("");
        }
        System.out.println(list[0].getName());
        System.out.println(list[0].getQuantity());
        //make a separate array of strings using each individual items name and quantity
        String[] items = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            String thing = list[i].getName() + "-" + list[i].getQuantity();
            items[i] = thing;
        }
        System.out.println(Arrays.toString(items));
        // check each item in the list for matching categories
    }

}
