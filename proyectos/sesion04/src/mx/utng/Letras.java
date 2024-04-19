package mx.utng;

import mx.utng.S04.ContadorCaracteres;
import mx.utng.S04.Lector;

public class Letras {
    public static void main(String[] args) {
        
    
    //crear un lector
    Lector lector=new Lector();
    lector.muestraMensaje("Teclea una palabra: ");
    String palabra=lector.leerEntrada();

    //crear un nuevo objeto contador de caracteres 
    ContadorCaracteres contador= new ContadorCaracteres();

    int numeroVocales=contador.cuentaVocales(palabra);
    System.out.println("Hay "+ numeroVocales+" vocales");

    int numeroConsonates=contador.cuentaConsonates(palabra);
    System.out.println("Hay "+ numeroConsonates+" consonantes");

    int numeros=contador.cuentaNumeros(palabra);
    System.out.println("Hay "+ numeros+" numeros");

    int numeroSimbolos=contador.cuentaSimbolos(palabra);
    System.out.println("Hay "+ numeroSimbolos+" simbolos");


    }
}
