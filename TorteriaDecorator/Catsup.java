/**
*@author Edgar Gante
*@version 1
*/
package TorteriaDecorator;
public class Catsup extends IngredienteDecoradorTorta {

  Torta torta;

  public Catsup(Torta torta) {
    this.torta = torta;
  }

  public String getDescripcion() {
    return torta.getDescripcion() + ", Catsup";
  }

  public double costo() {
    return 0.30 + torta.costo();
  }
}
