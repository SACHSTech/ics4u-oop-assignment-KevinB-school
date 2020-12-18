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
      //Nutritions croissantNeutritions = new Nutritions(250, "pasteries");
      //croissantNeutritions.outputAsLabel();
    OrderItem croissant = new Dessert("croissant", new Nutritions(250, "pasteries"), "pastery", new String[] {"vanilla",});
    croissant.getNutritions();
    ben.addNewItem(croissant);

    // summary
    ben.getSummary();
    ben.getSubtotalAndTotal();
  }
}