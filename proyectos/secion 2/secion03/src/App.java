import secion3.autor;

public class App {
    public static void main(String[] args) throws Exception {
        Autor autor =new Autor();
      autor.setNobre(nombre:"Diego");
      autor.serApellido(Pardo);
      autor.setEdad(18);
    libro libro=new Libro();
    libro.setTitulo("minecraft");
    libro.setAutor(autor);
    libro.setAnio(2024);
    libro.setNumeroPaginas(999);

    System.out.println("Libro: "+getTitulo());
    System.out.println("Autor: "+libro.getAutor().getNombre()+" "+libro.getAutor().getApellido);
        System.out.println("Hello, World!");
    }
}
