package mx.utng.reto;

import java.time.LocalDate;

public class Empleado extends Persona {
    private float salario;
    
    


    public Empleado(String nombre, byte edad, LocalDate fechaNacimiento, float salario) {
        super(nombre, edad, fechaNacimiento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    
    
    
    
}
