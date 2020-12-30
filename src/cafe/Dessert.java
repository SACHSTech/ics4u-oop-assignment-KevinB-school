package cafe;
import cafe.*;

public class Dessert extends OrderItem{

  // Instance variables
  private String strTypeOfDessert;
  private String[] strToppings;
  private double dblPrice;

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

  // Outputing summary of the item
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

  // returing the price of the item
  public double getPrice() {
    return dblPrice;
  }
}