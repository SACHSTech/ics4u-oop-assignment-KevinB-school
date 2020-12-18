package cafe;
import cafe.*;

public class Nutritions {

  private double dblServingSize;
  private double dblCalories;
  private double dblSugar;
  private double dblFat;
  private double dblProtine;

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

  public void outputAsLabel(){
    System.out.println("per " + this.dblServingSize + " gram serving: ");
    System.out.println("calories: " + this.dblCalories);
    System.out.println("sugar: " + this.dblSugar);
    System.out.println("fat: " + this.dblFat);
    System.out.println("protine: " + this.dblProtine);
  }
}