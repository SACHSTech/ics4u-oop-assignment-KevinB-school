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

  public void removeAddedItem(OrderItem OldOrderItem) {
    int i;

    for (i = 0; i < itemsInOrder.size(); i++) {
      if (itemsInOrder.get(i).equals(OldOrderItem)) {
        itemsInOrder.remove(i);
      }
    }
  }

  public void addTotal() {
    for (int i = 0; i < itemsInOrder.size(); i++) {
      this.dblTotal += itemsInOrder.get(i).getPrice();
    }
  }

  public void getSummary() { 
    int randomTableNumber = (int)(Math.random() * 7) + 1;
    System.out.println("============================");

    if (blnTakeOut == true) {
      System.out.println("Takeout order: ");
    } else if (blnTakeOut == false) {
      System.out.println("Table #" + randomTableNumber + "'s order: ");
    }

    for (int i = 0; i < itemsInOrder.size(); i++) {
      itemsInOrder.get(i).getSummary();
    }

    System.out.println("============================");
  }

  public void getSubtotalAndTotal() {
    addTotal();
    System.out.println("Subtotal: " + Math.round((dblTotal)*100.0)/100.0);
    System.out.println("Tax: " + Math.round((dblTotal * 0.13)*100.0)/100.0);
    System.out.println("Total: " + Math.round((dblTotal * 1.13)*100.0)/100.0);
  }

}