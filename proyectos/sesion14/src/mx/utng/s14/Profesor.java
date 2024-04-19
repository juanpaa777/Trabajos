package mx.utng.s14;

public class Profesor extends Persona{
    private String idProfesor;

    public Profesor(String nombre, String apellidos, String idProfesor) {
        super(nombre, apellidos);
        this.idProfesor = idProfesor;
    }

    @Override
    public void vivir() {
      System.out.println("vive bien,");

    }
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Profesor: %s%n", idProfesor);

    }
    public String getApellidos() {
        return idProfesor;
    }
}
