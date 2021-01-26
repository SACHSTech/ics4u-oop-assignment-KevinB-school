package cafe;
import cafe.*;

/**
* A program that extends the orderitem class. This program is for defining foods, cooking them, 
* determining their price, and outputing their summary.
* @author: Kevin Basta
*/
public class Food extends OrderItem {

  // Instance variables
  private String strTypeOfFood;
  private double dblPrice;
  private String[] strSausesAndToppings;

  /**
  * Constructor method for the Food class
  *
  * @param newName  The name of the order item
  * @param newNeutritions  The constructor for the Nutritions class
  * @param newTypeOfFood  The spesific type of food being ordered
  * @param newSausesAndToppings  An array containing all toppings put on the food item
  */
  public Food(String newName, Nutritions newNeutritions, String newTypeOfFood, String[] newSausesAndToppings){
    super(newName, newNeutritions);
    this.strTypeOfFood = newTypeOfFood;
    this.strSausesAndToppings = newSausesAndToppings;

    // Giving price based on the type of food
    if (strTypeOfFood.equals("sandwich")) {
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
  
  /**
  * A method that simulates the cooking and preparing of the food through prints
  */
  public void cook() {
    System.out.println("");
    if (strTypeOfFood.equals("sandwich")) {
      System.out.println("Toasting bread...");
      System.out.println("Adding ingridents...");
    } else if (strTypeOfFood.equals("eggs")) {
      System.out.println("Preparing pan...");
      System.out.println("cooking...");
    } else {
      System.out.println("No cooking required...");
    }
  }

  /**
  * A method that outputs the summary of item using prints
  */
  public void getSummary() {
    System.out.print(super.getName() + " with: ");
    for(int i = 0; i < strSausesAndToppings.length; i++) {
      if (i == (strSausesAndToppings.length - 1)) {
        System.out.print(strSausesAndToppings[i] + ".");
      } else {
        System.out.print(strSausesAndToppings[i] + ", ");
      }
    }
    System.out.println(" $" + dblPrice);
  }

  /**
  * A method that returns the price of the food item
  *
  * @return dblPrice, the price of the food item
  */
  public double getPrice() {
    return this.dblPrice;
  }
}