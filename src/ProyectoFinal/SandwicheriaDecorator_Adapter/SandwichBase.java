package SandwicheriaDecorator_Adapter;
public class SandwichBase implements Sandwich{

  public double getCost(){
    return 0;
  }

  public String getDescription(){
    return "";
  }

  public String toString(){
    return getDescription() + "CostoTotal :" + getCost();
  }
}
