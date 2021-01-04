package cafe;
import cafe.*;

public class Main {
  public static void main(String[] args) {

    // new order
    Order ben = new Order(false);

    // adding 1 Item
    Nutritions chocolateCakeNeutritions = new Nutritions(250, "cakes");
    OrderItem chocolateCake = new Dessert("chocolate cake", chocolateCakeNeutritions, "cake", new String[] {"Sprinkles", "Nutella"});
    ben.addNewItem(chocolateCake);

    // adding another Item
    OrderItem croissant = new Dessert("croissant", new Nutritions(250, "pasteries"), "pastery", new String[] {"vanilla"});
    //croissant.getNutritions();
    ben.addNewItem(croissant);

    // adding another Item
    OrderItem coffeeLarge = new Drinks("Gater coffee",  new Nutritions(45, "warm drinks"), "coffee", 'L', true);
    ben.addNewItem(coffeeLarge);
    
    // adding another Item
    OrderItem hamSandwich = new Food("Ham Sandwich", new Nutritions(400, "sandwiches"), "sandwhich", new String[] {"ketchup", "mayo"});
    ben.addNewItem(hamSandwich);
    hamSandwich.getNutritions();
    //ben.removeAddedItem(hamSandwich);
    
    // summary
    ben.getSummary();
    ben.getSubtotalAndTotal();
  }
}