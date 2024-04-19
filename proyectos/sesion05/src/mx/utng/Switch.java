package mx.utng;

import java.util.Scanner;

public class Switch {
     public static void main(String[] args) {

        try (//definir objeto scanner
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("Teclea tu calificacion");
            int calificicacion=scanner.nextInt();
             switch (calificicacion) {
                case 10:
                System.out.println("muy bien");
                    break;
                case 9:
                System.out.println("bien");
                    break;

                case 8:
                System.out.println("Bien sigue asi");
                break;
                case 7:
                System.out.println("Regular");
                break;
                case 6:
                System.out.println("esfuerzate un poco mas");
                break;
                case 5:
                System.out.println("reprobaste a r1");
                break;
             
                default: System.out.println("Calificacion invalida");
                    break;
             }
        }
        

    }
}
