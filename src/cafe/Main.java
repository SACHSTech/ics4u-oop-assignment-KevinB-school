package cafe;
import cafe.*;

public class Main {
  public static void main(String[] args) {
    Order ben = new Order(false);
    Nutritions chocolateCakeNeutritions = new Nutritions(250, "cakes");
    OrderItem chocolateCake = new Dessert("chocolate cake", chocolateCakeNeutritions, "cake", new String[] {"Sprinkles", "Nutella"});
    ben.addNewItem(chocolateCake);
    ben.getSummary();
  }
}