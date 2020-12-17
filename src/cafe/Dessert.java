package cafe;
import cafe.*;

public class Dessert extends order{

  private String strTypeOfDessert;
  private String[] strToppings;

  public Dessert(String newName, String[][] newNeutritions, String[] newToppings) {
    super(newName, newNeutritions);
    this.strToppings = newToppings;
  }

}