package cafe;
import cafe.*;

/**
* A program that extends the orderitem class. This program is for defining drinks, brewing them, 
* determining their price, and outputing their summary.
* @author: Kevin Basta
*/
public class Drinks extends OrderItem{

  // Instance variables
  private String strTypeOfDrink;
  private double dblPrice;
  private char charSize;
  private boolean blnHotDrink;

  /**
  * Constructor method for the Drinks class
  *
  * @param newName  The name of the order item
  * @param newNeutritions  The constructor for the Nutritions class
  * @param newTypeOfDrink  The spesific type of drink being ordered
  * @param newSize  The size of the drink picked using L, M, or S
  * @param newHotDrink  A boolean that determines whether the drink is warm or not
  * @return description of the return value
  */
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

  /**
  * A method that simulates the brewing and preparing of the drink through prints
  */
  public void brewDrink() {
    System.out.println("");
    if (blnHotDrink) {
      System.out.println("brewing " + strTypeOfDrink + "...");
    } else if (blnHotDrink == false) {
      System.out.println("blending ingridents");
    }
  }

  /**
  * A method that outputs the summary of item using prints
  */
  public void getSummary() {
    System.out.print(charSize + " " + super.getName() + ".");

    System.out.println(" $" + dblPrice);
  }

  /**
  * A method that returns the price of the drink item
  *
  * @return dblPrice, the price of the drink item
  */
  public double getPrice() {
    return this.dblPrice;
  }
}