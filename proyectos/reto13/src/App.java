
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class App {

   /**
    *@autor <Juan Diego Pardo Zamarripa>
    *@categoria: GDS0622
    *@since 2024-02-10
    */
    public static void main(String[] args) throws Exception {
       //crea una lista de cadenas//
        List<String> frutas = new ArrayList<>();
        frutas.add("Platanos");
       //integra cada elemento a la lista //
        Collections.addAll(frutas, "Platanos","Sandia", "Pera", "Manzana", "Naranja","Kiwi");
        System.out.println(frutas);
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        //este metodo invierte el orden de los elementos de la lista//
        Collections.reverse (frutas);
        System.out.println(frutas);
        //encuentra el elemento mas pequenio//
        System.out.println("Mas pequenio: " + Collections.min(frutas));
        //encuentra el elemento mas grande//
        System.out.println("Mas grande: " + Collections.max(frutas));
        Collections.sort(frutas);
        System.out.println(frutas);
        //este metodo encuentra la posicion de un elemento en la lista//
        System.out.println("Kiwi se encuentran en la posicion : "
        + (Collections.binarySearch(frutas, "Sandia")+1));
        Collections.addAll(frutas, "Platanos","Platanos", "Platanos");
        System.out.println(frutas);

        //este metodo ordena una lista aleatoriamente//
        Collections.shuffle(frutas);
        System.out.println(frutas);
        System.out.println("Hay"+Collections.frequency(frutas, "Platanos")+"en la lista");


    }
}



