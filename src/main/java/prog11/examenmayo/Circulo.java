/**
*Clase que contiene metodos para calcular area y perimetro de un circulo
*
*/
package prog11.examenmayo;
/**
 *@version 22/05/2023
 * @author Marina
 */
public class Circulo {

  private double radio;
  private String color;
  private static int numCirculos;

/**
*Metodo constructor dee la clase
@param radio contiene valor de la radio
@param color  contiene valor del color
*/

  public Circulo(double radio, String color) {
    this.radio = radio;
    this.color = color;
  }

  /**
   * @return the radio
   */
  public double getRadio() {
    return radio;
  }

  /**
   * @param radio the radio to set
   */
  public void setRadio(double radio) {
    this.radio = radio;
  }

  /**
   * @return the color
   */
  public String getColor() {
    return color;
  }

  /**
   * @param color the color to set
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * @return the numCirculos
   */
  public static int getNumCirculos() {
    return numCirculos;
  }

  /**
   * @param aNumCirculos the numCirculos to set
   */
  public static void setNumCirculos(int aNumCirculos) {
    numCirculos = aNumCirculos;
  }
  /**
   * Metodo calculoArea calcula la area del circulo.
   * @return devuelve area del circulo
   */
  public double calculoArea() {
    if (this.getRadio() < 0) {
      throw new IllegalArgumentException("Radio negativo");
    }
    return (Math.pow(getRadio(), 2) * Math.PI);
  }
 /**
   * Metodo calculoPerimetro calcula el perimetro del circulo,comprobando el radio,que no sea negatrivo.
   *
   * @return devuelve perimetro del circulo
   * @throws java.lang.Exception controla las excepciones generadas en caso del radio negativo o muy grande
   */
  public double calculoPerimetro() throws Exception {
    if (this.getRadio() < 0) {
      throw new Exception("Radio negativo");
    } else if (getRadio() >= 100) {
      throw new Exception("Radio muy grande");
    } else {
      return (2 * Math.PI * this.getRadio());
    }
  }

}
