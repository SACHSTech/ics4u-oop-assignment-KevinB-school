package cafe;

import cafe.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Friday febuary, 1st, 2021 Cash Register
    // loading up today's menue

    // Foods
    OrderItem plainHamSandwich = new Food("Ham Sandwich", new Nutritions(400, "sandwiches"), "sandwich", new String[] {"none"});

    OrderItem mayoHamSandwich = new Food("Ham Sandwich", new Nutritions(400, "sandwiches"), "sandwich", new String[] {"mayo"});

    OrderItem ketchupHamSandwich = new Food("Ham Sandwich", new Nutritions(400, "sandwiches"), "sandwich", new String[] {"ketchup"});

    // Drinks
    Drinks coffeeLarge = new Drinks("plain coffee",  new Nutritions(45, "warm drinks"), "coffee", 'L', true);

    Drinks coffeeMedium = new Drinks("plain coffee",  new Nutritions(45, "warm drinks"), "coffee", 'M', true);

    Drinks coffeeSmall = new Drinks("plain coffee",  new Nutritions(45, "warm drinks"), "coffee", 'M', true);

    // Desserts
    Dessert chocolateCake = new Dessert("chocolate cake", new Nutritions(250, "cakes"), "cake", new String[] {"Sprinkles", "Nutella"}); // NOTE DESSERT TYPE INSTEAD OF ORDER ITEM

    Dessert croissant = new Dessert("croissant", new Nutritions(250, "pasteries"), "pastery", new String[] {"vanilla"});



    // order #1
    Order ben = new Order(false);

    // adding Item 1 and boxing it
    chocolateCake.boxDessert();
    ben.addNewItem(chocolateCake);

    // adding Item 2
    ben.addNewItem(coffeeLarge);
    
    // adding Item 3 but then removing it
    ben.addNewItem(plainHamSandwich);
    ben.removeAddedItem(plainHamSandwich);
    
    // getting ben's order summary and total
    ben.getSummary();
    ben.getSubtotalAndTotal();



    // order #2
    Order Everett = new Order(true);

    // adding Item 1 and getting nutritions
    croissant.getNutritions();
    Everett.addNewItem(croissant);

    // adding Item 2
    Everett.addNewItem(mayoHamSandwich);

    // getting Everett's order summary and total
    Everett.getSummary();
    Everett.getSubtotalAndTotal();



    // order #3
    Order Matthew = new Order(true);

    // adding Matthew's custom Sandwich and cooking it
    System.out.println("What type of custom sandwich would you like? (chicken, ham, eggs)");
    String strSandwichName = keyboard.readLine() + " sandwich";
    System.out.println("What 2 toppings/sauses would you like on your sandwich? (ketchup, mayo, mustard, radish, pickles, tomatoes, lettus)");
    String strTopping1 = keyboard.readLine();
    String strTopping2 = keyboard.readLine();

    Food customSandwich = new Food(strSandwichName, new Nutritions(500, "sandwiches"), "sandwich", new String[] {strTopping1, strTopping2});
    Matthew.addNewItem(customSandwich);
    customSandwich.cook();

    // adding item 2 and brewing it
    Matthew.addNewItem(coffeeMedium);
    coffeeMedium.brewDrink();

    // getting Matthew's order summary and total
    Matthew.getSummary();
    Matthew.getSubtotalAndTotal();



    // printing earnings of the day
    System.out.println("");
    System.out.println("Day/Session total earning: " + Math.round((Order.dblDayEarnings * 1.13)*100.0)/100.0);
  }
}