import mx.utng.s07.Lector;
import mx.utng.s07.ListasTareas;
import mx.utng.s07.Menu;


public class App{
    public static void main(String[] args) throws Exception {
        System.out.println("hello world!");
        Menu menu =new Menu();
        Lector lector =new Lector();
        ListasTareas lista =new ListasTareas();

        byte opcionSeleccionada = 0;
        
        do {
            menu.muestraopciones();
            opcionSeleccionada = lector.leerOpcion();
          
            System.out.println("\n\nLa opcion seleccionada es : "+opcionSeleccionada);
            switch (opcionSeleccionada) {
                case 1:
                    lista.crearNuevaListaDeTareas();
                    break;
                case 2:
                    lista.verListaDeTareas();
                    break;
                case 3:
                    lista.verTareasDeLista();
                    break;
                case 4:
                    lista.actualizarListaDeTareas();
                    break;
                case 5:
                    lista.eliminarListaDeTareas();
                    break;
                case 6:
                    System.out.println("Saliendo del programa.....bye");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcionSeleccionada !=6);
}
}
