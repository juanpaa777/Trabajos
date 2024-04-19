package Reto1;

import java.util.Scanner;

public class Reto1 {
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe tu calificacion please: ");
        int cal=scanner.nextInt();
        scanner.close();

        if (cal==10) {
            System.out.println("perfecto");
        }else if (cal==9) {
            System.out.println("Muy Bien");
        }else if (cal==8) {
            System.out.println("bien");
        }else if (cal==7) {
            System.out.println("sigue esforzandote");
        }else if (cal==6) {
            System.out.println("reprovaste");
        }else if (cal<=5) {
            System.out.println("adios nos vemos el proximo anio");
        }else System.out.println("Ingresa un valor valido");


        


    }
}
