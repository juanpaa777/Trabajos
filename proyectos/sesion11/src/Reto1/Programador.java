package Reto1;

import java.time.LocalDate;

public class Programador extends Empleado {
    private String lenguajePrincipal;

    

   
    public Programador(String nombre, byte edad, LocalDate fechaNacimiento, float salario, String lenguajePrincipal) {
        super(nombre, edad, fechaNacimiento, salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    
    public void mostrarDatos(){
        System.out.println("El lenguaje del programados es: "+lenguajePrincipal);
    }
    
    
}
