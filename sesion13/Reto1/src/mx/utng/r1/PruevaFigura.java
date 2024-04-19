package mx.utng.r1;
/**
 * @author <Juan Diego Pardo Zamarripa>
 * @category <GDS0622>
 * @since <07/02/2024>
 */

public class PruevaFigura {
    public static void main(String[] args) {
        Figura figura = null;

        figura = new Triangulo();
        figura.formulaCalculoArea();

        figura = new Rectangulo ();
        figura.formulaCalculoArea();

        figura = new Cuadrado();
        figura.formulaCalculoArea();
    }

}
