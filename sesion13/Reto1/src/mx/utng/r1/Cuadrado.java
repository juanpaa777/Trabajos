package mx.utng.r1;

public class Cuadrado implements Figura {
    private double lado;

    {
        lado = 60;
    }
@Override
public double formulaCalculoArea() {
    System.out.println("El area del cuadrado es: "+lado*lado);
    return lado;
   
   
}
}
