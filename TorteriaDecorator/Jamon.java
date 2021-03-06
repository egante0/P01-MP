/**
*@author Edgar Gante
*@version 1
*/
package TorteriaDecorator;
public class Jamon extends IngredienteDecoradorTorta {

  Torta torta;

  public Jamon(Torta torta) {
    this.torta = torta;
  }

  public String getDescripcion() {
    return torta.getDescripcion() + ", Jamón";
  }

  public double costo() {
    return 2.50 + torta.costo();
  }
}
