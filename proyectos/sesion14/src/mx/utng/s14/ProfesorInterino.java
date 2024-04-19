package mx.utng.s14;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
    public ProfesorInterino(String nombre, String apellidos, String idProfesor) {
        super(nombre, apellidos, idProfesor);
        //TODO Auto-generated constructor stub
    }

    private LocalDate fechaTerminacion;

    public LocalDate getFechaTerminacion() {
        return fechaTerminacion;
    }

    public void setFechaTerminacion(LocalDate fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
    } 
    
    @overide 
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("desempleado a partir de:"+ fechaTerminacion);
    }
}
