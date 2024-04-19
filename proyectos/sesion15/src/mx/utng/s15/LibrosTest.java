package mx.utng.s15;

import java.util.PriorityQueue;
import java.util.Queue;

public class LibrosTest {
    public static void main (String[] args) {
    //crear queue//
    Queue<Libro>Libros =new PriorityQueue<>();
    libros.add(new Libro("Libro 1", 3));
    libros.add(new Libro("Libro 2", 1));
    libros.add(new Libro("Libro 3", 2));

    Libro libro = null;
    while ((libro = libros.poll())!= null) {
        System.out.println(libro.getTitulo());
        
    }
    System.out.println(libros);
}

    @Override
    public String toString() {
        return "Libro  [titulo=" + titulo + , edicion= + "]";
        
    }

}
