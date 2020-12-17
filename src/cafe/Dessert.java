package cafe;
import cafe.*;

public class Dessert extends OrderItem{

  private String strTypeOfDessert;
  private String[] strToppings;
  private double dblPrice;

  public Dessert(String newName, Nutritions newNeutritions, String newTypeOfDessert, String[] newToppings) {
    super(newName, newNeutritions);
    this.strToppings = newToppings;
    this.strTypeOfDessert = newTypeOfDessert;
    if (strTypeOfDessert.equals("cake")) {
      dblPrice = 5.54;
    } else if (strTypeOfDessert.equals("pastery")) {
      dblPrice = 3.23;
    } else if (strTypeOfDessert.equals("ice cream")) {
      dblPrice = 1.15;
    }
  }

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

  public double getPrice() {
    return dblPrice;
  }
}