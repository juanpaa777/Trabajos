package ej3;

import java.time.LocalDate;

public class Formato {
    public static void main(String[] args) {
        final String NOMBRE = "Manco";
        final int EDAD = 3;
        final float ESTATURA = 30.5f;
        final LocalDate FECHA_NACIMIENTO = LocalDate.of(2004, 05, 14);
        System.out.println("El nombre de mi mascota es: "+NOMBRE+" Tiene una edad de:"+EDAD+" su estatura es:"+ESTATURA+" Nacio en:"+FECHA_NACIMIENTO);
        System.out.printf("El nombre de mi mascota es: %s Tiene una edad de: %d su estatura es: %F Nacio el dia %4$te del mes %4$tb del anio %4ty %n", NOMBRE, EDAD, ESTATURA, FECHA_NACIMIENTO);
    }
}
