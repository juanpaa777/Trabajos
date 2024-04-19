package mx.utng.s14;
import java.time.LocalDate;
public class polimorfismo {
    public static void main (String [] args ){
        Profesor profa = new Profesor("paty", "Hernandez", "GDS0622");
        profa.vivir();
        profa.mostrarDatos();
      
        Profesor profe = new ProfesorInterino("diegp", "pardo", "GDS0622",LocalDate.of
        );

    }
}
