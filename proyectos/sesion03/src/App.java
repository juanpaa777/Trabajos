import mx.utng.s03.Autor;
import mx.utng.s03.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        Autor autor =new Autor();
        autor.setNombre("Diego");
        autor.setApellido("Pardo");
        autor.setEdad(18);

        Libro libro=new Libro();
        libro.setTitulo("Elpaketin");
        libro.setAutor(autor);
        libro.setAnio(2077);
        libro.setNumPaginas(999);

        System.out.println("Libro: "+libro.getTitulo());
        System.out.println("Autor: "+libro.getAutor().getNombre()+" "+libro.getAutor().getApellido());
        System.out.println("Numero de paginas: "+libro.getNumPaginas());
    }
}
