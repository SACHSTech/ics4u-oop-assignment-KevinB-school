package cafe;
import cafe.*;

public abstract class OrderItem {

  private String strName;
  private Nutritions classNeutritions;

  public OrderItem(String newName, Nutritions newNeutritions) {
    this.strName = newName;
    this.classNeutritions = newNeutritions;
  }

  public String getName() {
    return this.strName;
  }

  public Nutritions getNutritions() {
    return this.classNeutritions;
  }

  public abstract void getSummary();

  public abstract double getPrice();

}