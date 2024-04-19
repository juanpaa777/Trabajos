package mx.utng.S04;

import java.util.Scanner;

public class Lector {

    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        
    }

    //metodo muestra una cadena dada como parametro
    public void muestraMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    //leer a partir del escanner
    public String leerEntrada(){
        return scanner.nextLine();
    }

    
}
