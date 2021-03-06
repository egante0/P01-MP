package SandwicheriaDecorator_Adapter;
public class PanBlanco extends IngredienteDecorator{

  public PanBlanco(Sandwich s){
    super(s);
  }

  public double getCost(){
    return sandwich.getCost() + 5;
  }

  public String getDescription(){
    return sandwich.getDescription() + ", Pan blanco";
  }
}
