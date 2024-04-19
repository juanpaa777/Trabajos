package mx.utng.sesion20;

public class Gobierno {
    private static Gobierno instancia;
    private Gobierno(){
        System.out.println("unica instancia");
    }
    public static Gobierno getInstancia(){
        if(instancia == null)
           instancia = new Gobierno();
        return instancia;
    }
    public void darApollo(){
        System.out.println("Dar apoyo al ciudadano");
    }
}
