package cafe;
import cafe.*;

public class Drinks extends OrderItem{

  // Instance variables
  private String strTypeOfDrink;
  private double dblPrice;
  private char charSize;
  private boolean blnHotDrink;

  public Drinks(String newName, Nutritions newNeutritions, String newTypeOfDrink, char newSize, boolean newHotDrink) {
    super(newName, newNeutritions);
    this.charSize = newSize;
    this.strTypeOfDrink = newTypeOfDrink;
    this.blnHotDrink = newHotDrink;

    // Giving price based on the size on drink
    if (charSize == 'S') {
      dblPrice = 1.15;
    } else if (charSize == 'M') {
      dblPrice = 2.35;
    } else if (charSize == 'L') {
      dblPrice = 4.10;
    }
    
    // Giving price based on the type of drink 
    if (strTypeOfDrink.equals("coffee")) {
      dblPrice += 0.50;
    } else if (strTypeOfDrink.equals("smoothie")) {
      dblPrice += 1.50;
    } else if (strTypeOfDrink.equals("tea")) {
      dblPrice += 0.25;
    }
  }

  // Drink brewing simulation
  public void brewDrink() {
    System.out.println("");
    if (blnHotDrink) {
      System.out.println("brewing " + strTypeOfDrink + "...");
    } else if (blnHotDrink == false) {
      System.out.println("blending ingridents");
    }
  }

  // Outputing summary of the item
  public void getSummary() {
    System.out.print(charSize + " " + super.getName() + ".");

    System.out.println(" $" + dblPrice);
  }

  // returing the price of the item
  public double getPrice() {
    return this.dblPrice;
  }
}