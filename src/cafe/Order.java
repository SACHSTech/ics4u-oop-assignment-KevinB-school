package cafe;
import cafe.*;
import java.util.ArrayList;

public class Order {

  private boolean blnTakeOut;
  private double dblTotal;
  private ArrayList<OrderItem> itemsInOrder;

  public Order(boolean newTakeOut) {
    this.blnTakeOut = newTakeOut;
    this.dblTotal = 0.0;
    this.itemsInOrder = new ArrayList<OrderItem>();
  }

  public void addNewItem(OrderItem newOrderItem){
    itemsInOrder.add(newOrderItem);
  }

  public void addToTotal(double dblCost) {
    this.dblTotal += dblCost;
  }

  public void getSummary() { 
    for (int i = 0; i < itemsInOrder.size(); i++) {
      itemsInOrder.get(i).getSummary();
    }
  }

}