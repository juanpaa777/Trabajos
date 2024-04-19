package mx.utng.s07;

import java.util.Scanner;

public class Lector {
    private Scanner Scanner = new Scanner(System.in);

    public byte leerOpcion(){
        System.out.println("opcion");
        return Scanner.nextByte();
    }
}
