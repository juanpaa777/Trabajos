package mx.utng.r1;

public class Rectangulo implements Figura {

  private double altura;
  private double base;
  {
    base = 100;
    altura = 200;
  }

  

  @Override
  public double formulaCalculoArea() {
    System.out.println("El area del rectangulo es: " + (altura * base));
    return altura;

  }

}
