package cafe;
import cafe.*;

public class Food extends OrderItem{

  // Instance variables
  private String strTypeOfFood;
  private double dblPrice;

  public Food(String newName, Nutritions newNeutritions, String newTypeOfFood){
    super(newName, newNeutritions);
    this.strTypeOfFood = newTypeOfFood;

    // Giving price based on the type of food
    if (strTypeOfFood.equals("sandwhich")) {
      dblPrice = 1.52;
    } else if (strTypeOfFood.equals("doughnut")) {
      dblPrice = 0.55;
    } else if (strTypeOfFood.equals("cookie")) {
      dblPrice = 0.65;
    } else if (strTypeOfFood.equals("eggs")) {
      dblPrice = 1.12;
    } else {
      dblPrice = 1.01;
    }
  }
  
  // Cooking simulation
  public cook() {
    if (strTypeOfFood.equals("sandwhich")) {
      System.out.println("Toasting bread...");
      System.out.println("Adding ingridents...");
    } else if (strTypeOfFood.equals("eggs")) {
      System.out.println("Preparing pan...");
      System.out.println("cooking...");
    } else {
      System.out.println("No cooking required...");
    }
  }

  // Outputing summary of the item
  public void getSummary() {
    System.out.print(super.getName() + ".");

    System.out.println(" $" + dblPrice);
  }

  // returing the price of the item
  public double getPrice() {
    return dblPrice;
  }
}