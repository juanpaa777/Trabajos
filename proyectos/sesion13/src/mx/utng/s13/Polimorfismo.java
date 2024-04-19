package mx.utng.s13;
/**
 * @author <Juan Diego Pardo Zamarripa>
 * @category <GDS0622>
 * @since <06/02/2024>
 */

 
public class Polimorfismo {
    
    public static void main(String[] args) {
        Venado v = new Venado();
        Animal a = v;
        Hervivoro h = v;
        Object o = v;

        System.out.println("venado :"+ (v instanceof Venado));
        System.out.println("Animal: "+ (v instanceof Animal));
        System.out.println("Hervivoro: "+ (v instanceof Hervivoro));
        System.out.println("Object: "+ (v instanceof Object));
       // System.out.println("Scanner :"+ (a instanceof Scanner));
    }
}
