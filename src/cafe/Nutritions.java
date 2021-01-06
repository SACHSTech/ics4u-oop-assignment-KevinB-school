package cafe;
import cafe.*;

/**
* A program that calculates calories, sugar, fat, and protine based on the serving size 
* of a given item. Has an output as label method that allows you to print all the calculated
* information out.
* @author: Kevin Basta
*/
public class Nutritions {

  // Instance variables
  private double dblServingSize;
  private double dblCalories;
  private double dblSugar;
  private double dblFat;
  private double dblProtine;

  /**
  * Constructor method for the Nutritions class
  *
  * @param newServingSize  the serving size of the order item in grams
  * @param newCatagory  the type of food the order item is
  */
  public Nutritions(double newServingSize, String newCatagory) {
    this.dblServingSize = newServingSize;

    if(newCatagory.equals("pasteries")) {

      dblCalories = dblServingSize * 2.53;
      dblSugar = dblCalories / 25.0;
      dblFat = dblCalories / dblServingSize;
      dblProtine = dblFat / dblSugar;

    } else if (newCatagory.equals("cakes")) {

      dblCalories = dblServingSize * 5.12;
      dblSugar = dblCalories / 15.0;
      dblFat = dblCalories / dblServingSize;
      dblProtine = dblFat / dblSugar;

    } else if (newCatagory.equals("sandwiches")) {

      dblCalories = dblServingSize * 1.53;
      dblSugar = dblCalories / 50.0;
      dblFat = dblCalories / dblServingSize;
      dblProtine = dblFat / dblSugar;

    } else if (newCatagory.equals("warm drinks")) {

      dblCalories = dblServingSize / 3.0;
      dblSugar = dblServingSize / 50.0;
      dblFat = 0.0;
      dblProtine = 0.0;

    } else if (newCatagory.equals("cold drinks")) {

      dblCalories = dblServingSize / 3.0;
      dblSugar = dblServingSize / 30.0;
      dblFat = 0.0;
      dblProtine = 10.0;

    } else if (newCatagory.equals("salads")) {

      dblCalories = dblServingSize * 0.53;
      dblSugar = dblCalories / 60.0;
      dblFat = dblCalories / dblServingSize;
      dblProtine = dblFat / dblSugar;

    } 
  }

  /**
  * A method that takes all the calculated values in the constructor method and prints them
  */
  public void outputAsLabel(){
    System.out.println("per " + this.dblServingSize + " gram serving: ");
    System.out.println("calories: " + this.dblCalories);
    System.out.println("sugar: " + this.dblSugar);
    System.out.println("fat: " + this.dblFat);
    System.out.println("protine: " + this.dblProtine);
  }
}