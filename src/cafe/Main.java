package cafe;
import cafe.*;

public class Main {
  public static void main(String[] args) {

    // Friday febuary, 1st, 2021 Cash Register
    // loading up today's menue

    // Foods
    OrderItem plainHamSandwich = new Food("Ham Sandwich", new Nutritions(400, "sandwiches"), "sandwhich", new String[] {"none"});

    OrderItem mayoHamSandwich = new Food("Ham Sandwich", new Nutritions(400, "sandwiches"), "sandwhich", new String[] {"mayo"});

    OrderItem ketchupHamSandwich = new Food("Ham Sandwich", new Nutritions(400, "sandwiches"), "sandwhich", new String[] {"ketchup"});

    // Drinks
    OrderItem coffeeLarge = new Drinks("plain coffee",  new Nutritions(45, "warm drinks"), "coffee", 'L', true);

    OrderItem coffeeMedium = new Drinks("plain coffee",  new Nutritions(45, "warm drinks"), "coffee", 'M', true);

    OrderItem coffeeSmall = new Drinks("plain coffee",  new Nutritions(45, "warm drinks"), "coffee", 'M', true);

    // Desserts
    Dessert chocolateCake = new Dessert("chocolate cake", new Nutritions(250, "cakes"), "cake", new String[] {"Sprinkles", "Nutella"}); // NOTE DESSERT TYPE INSTEAD OF ORDER ITEM

    OrderItem croissant = new Dessert("croissant", new Nutritions(250, "pasteries"), "pastery", new String[] {"vanilla"});



    // order #1
    Order ben = new Order(false);

    // adding Item 1 and boxing it
    chocolateCake.boxDessert();
    ben.addNewItem(chocolateCake);

    // adding Item 2
    ben.addNewItem(coffeeLarge);
    
    // adding Item 3
    ben.addNewItem(plainHamSandwich);
    ben.removeAddedItem(plainHamSandwich);
    
    // getting ben's order summary
    ben.getSummary();
    ben.getSubtotalAndTotal();



    //order #2
    Order Everett = new Order(true);

    // adding Item 1
    croissant.getNutritions();
    Everett.addNewItem(croissant);

    // adding Item 2
    Everett.addNewItem(mayoHamSandwich);

    // getting Everett's order summary
    Everett.getSummary();
    Everett.getSubtotalAndTotal();


    // printing earnings of the day
    System.out.println("");
    System.out.println("the total earnings were: " + Order.dblDayEarnings);
  }
}