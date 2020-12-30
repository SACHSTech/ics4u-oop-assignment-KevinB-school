package cafe;
import cafe.*;

public class Food extends OrderItem{

  // Instance variables
  private String strTypeOfFood;
  private double dblPrice;

  public Food(String newName, Nutritions newNeutritions, String newTypeOfFood){
    super(newName, newNeutritions);
    this.strTypeOfDrink = newTypeOfFood;

    // Giving price based on the type of food
    if (strTypeOfDrink.equals("sandwhich")) {
      dblPrice = 1.52;
    } else if (strTypeOfDrink.equals("doughnut")) {
      dblPrice = 0.55;
    } else if (strTypeOfDrink.equals("cookie")) {
      dblPrice = 0.65;
    } else if (strTypeOfDrink.equals("eggs")) {
      dblPrice = 1.12;
    }
  }

  // Outputing summary of the item
  public void getSummary() {
    System.out.print(charSize + " " + super.getName() + ".");

    System.out.println(" $" + dblPrice);
  }

  // returing the price of the item
  public double getPrice() {
    return dblPrice;
  }
}