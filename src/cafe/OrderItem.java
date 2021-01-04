package cafe;
import cafe.*;

public abstract class OrderItem {

  private String strName;
  private Nutritions classNeutritions;

  public OrderItem(String newName, Nutritions newNeutritions) {
    this.strName = newName;
    this.classNeutritions = newNeutritions;
  }
  
  // Add a prepare method

  public String getName() {
    return this.strName;
  }

  public void getNutritions() {
    System.out.println("------------------------------");
    System.out.println(strName + " neutrition facts: ");
    this.classNeutritions.outputAsLabel();
    System.out.println("------------------------------");
  }

  public abstract void getSummary();

  public abstract double getPrice();

}