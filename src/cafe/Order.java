package cafe;
import cafe.*;
import java.util.ArrayList;

/**
* A program that stores all the different orders that are made in a day/session and allows the  
* workers to add and remove items from an order, as well as get the summary and total of the 
* orders.
* @author: Kevin Basta
*/
public class Order {

  // Instance variables
  private boolean blnTakeOut;
  private double dblTotal;
  private ArrayList<OrderItem> itemsInOrder;
  public static double dblDayEarnings;

  /**
  * Constructor method for the Order class
  *
  * @param newTakeOut  a boolean that indicates whether or not an order is for take out or not
  */
  public Order(boolean newTakeOut) {
    this.blnTakeOut = newTakeOut;
    this.dblTotal = 0.0;
    this.itemsInOrder = new ArrayList<OrderItem>();
  }
  
  /**
  * Adds an item to the specified order
  *
  * @param newOrderItem  the variable name of the instance of the OrderItem class being added
  */
  public void addNewItem(OrderItem newOrderItem){
    itemsInOrder.add(newOrderItem);
  }

  /**
  * Removes an item from the specified order
  *
  * @param OldOrderItem  the variable name of the instance of the OrderItem class being removed
  */
  public void removeAddedItem(OrderItem OldOrderItem) {
    int i;

    for (i = 0; i < itemsInOrder.size(); i++) {
      if (itemsInOrder.get(i).equals(OldOrderItem)) {
        itemsInOrder.remove(i);
      }
    }
  }

  /**
  * Adds up the prices of all the items in the order and keeps it in the total variable
  */
  public void addTotal() {
    for (int i = 0; i < itemsInOrder.size(); i++) {
      this.dblTotal += itemsInOrder.get(i).getPrice();
    }
  }

  /**
  * Fetches and prints all the items in the order
  */
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


  /**
  * Calculates and prints subtotal, tax, and total
  */
  public void getSubtotalAndTotal() {
    addTotal();
    System.out.println("Subtotal: " + Math.round((dblTotal) * 100.0) / 100.0);
    System.out.println("Tax: " + Math.round((dblTotal * 0.13) * 100.0) / 100.0);
    System.out.println("Total: " + Math.round((dblTotal * 1.13) * 100.0) / 100.0);
    dblDayEarnings += Math.round((dblTotal * 1.13) * 100.0) / 100.0;
    System.out.println("");
  }

}