package mx.utng.s10.ej01;

public class Contador {
    
    private static short contadorclass;
    private short contadorInstancia;
    

    public Contador() {
       
        conyadorClase++;
        contadorInstancia++;
    }


    public static short getContadorClase(){
        return contadorclass;
    }
}
