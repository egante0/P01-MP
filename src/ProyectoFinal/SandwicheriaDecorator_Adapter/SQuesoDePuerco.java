package SandwicheriaDecorator_Adapter;
public class SQuesoDePuerco extends IngredienteDecorator{

  public SQuesoDePuerco(Sandwich s){
    super(s);
  }

  public double getCost(){
    return sandwich.getCost() + 3;
  }

  public String getDescription(){
    return sandwich.getDescription() + ", QuesoDePuerco";
  }
}
