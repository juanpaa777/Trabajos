package mx.utng.sesion20;

public class Ciudadano {
    public static void main(String[] args) {
        Gobierno gobierno = Gobierno.getInstancia();
        
        gobierno.darApollo();

        Gobierno pseudoOtro = Gobierno.getInstancia();
        pseudoOtro.darApollo();
    }
}
