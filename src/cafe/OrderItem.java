package cafe;
import cafe.*;

/**
* A program that defines the general things each order item on the menu should have
* it makes every child class have a get summary and get price method, as well as 
* having a method that allows the printing of the nutritional facts.
* @author: Kevin Basta
*/
public abstract class OrderItem {

  // Instance variables
  private String strName;
  private Nutritions classNeutritions;

  /**
  * Constructor method for the OrderItem class
  *
  * @param newName  the name of the order item
  * @param newNeutritions  the constructor for the Nutritions class
  */
  public OrderItem(String newName, Nutritions newNeutritions) {
    this.strName = newName;
    this.classNeutritions = newNeutritions;
  }
  
  /**
  * A method that returns the name of the order item
  *
  * @return strName, the name of the order item
  */
  public String getName() {
    return this.strName;
  }

  /**
  * A method that calls on the Nutritions class's outputAsLabel method
  */
  public void getNutritions() {
    System.out.println("------------------------------");
    System.out.println(strName + " neutrition facts: ");
    this.classNeutritions.outputAsLabel();
    System.out.println("------------------------------");
  }

  /**
  * Abstract method that forces child classes to have a getSummary method
  */
  public abstract void getSummary();

  /**
  * Abstract method that forces child classes to have a getPrice method
  */
  public abstract double getPrice();

}