package cafe;
import cafe.*;

/**
* A program that extends the orderitem class. This program is for defining desserts, preparing/
* boxing them, determining their price, and outputing their summary.
* @author: Kevin Basta
*/
public class Dessert extends OrderItem{

  // Instance variables
  private String strTypeOfDessert;
  private String[] strToppings;
  private double dblPrice;

  /**
  * Constructor method for the Dessert class
  *
  * @param newName  The name of the order item
  * @param newNeutritions  The constructor for the Nutritions class
  * @param newTypeOfDessert  The spesific type of dessert being ordered
  * @param newToppings  An array of toppings for the dessert
  */
  public Dessert(String newName, Nutritions newNeutritions, String newTypeOfDessert, String[] newToppings) {
    super(newName, newNeutritions);
    this.strToppings = newToppings;
    this.strTypeOfDessert = newTypeOfDessert;

    // Giving price based on the type of dessert
    if (strTypeOfDessert.equals("cake")) {
      dblPrice = 5.54;
    } else if (strTypeOfDessert.equals("pastery")) {
      dblPrice = 3.23;
    } else if (strTypeOfDessert.equals("ice cream")) {
      dblPrice = 1.15;
    }
  }

  /**
  * A method that simulates the baking and packaging of the dessert through prints
  */
  public void boxDessert() {
    System.out.println("");
    if (strTypeOfDessert.equals("ice cream")) {
      System.out.println("Preparing cone and icecream machine...");
      System.out.println("Putting " + strTypeOfDessert + " in the cone...");
    } else {
      System.out.println("Baking " + strTypeOfDessert + "...");
      System.out.println("Boxing " + strTypeOfDessert + "...");
    }
    System.out.println(strTypeOfDessert + " is ready!");
  }

  /**
  * A method that outputs the summary of item using prints
  */
  public void getSummary() {
    System.out.print(super.getName() + " with: ");
    for(int i = 0; i < strToppings.length; i++) {
      if (i == (strToppings.length - 1)) {
        System.out.print(strToppings[i] + ".");
      } else {
        System.out.print(strToppings[i] + ", ");
      }
    }
    System.out.println(" $" + dblPrice);
  }

  /**
  * A method that returns the price of the dessert item
  *
  * @return dblPrice, the price of the dessert item
  */
  public double getPrice() {
    return this.dblPrice;
  }
}