package mx.utng.s17;

import java.io.File;

public class Directorios {

  public static void main(String[] args) throws Exception {
    // directorio raiz
    File directorioInicial = new File("C:\\proyectos\\sesion17\\src\\mx\\utng\\s17\\temp");
    
    muestraContenidoDirectorio(directorioInicial);
  }

  private static void colocarEspacios(String directorioPadre, char simbolo){
    System.out.println("["+simbolo+"]");
    
    for (int i = 0; i < directorioPadre.length(); i++) {
      System.out.print("-");
    }
  }
  
  private static void muestraContenidoDirectorio(File directorio) {
    colocarEspacios(directorio.getParent(), 'D');
    System.out.println(directorio.getName());

    File[] subdirectorios = directorio.listFiles();
    
    for (File archivo : subdirectorios) {
      if (archivo.isFile()) {
        colocarEspacios(archivo.getParent(), 'A');
        System.out.println(archivo.getName());
        
      } else if (archivo.isDirectory()) {
        muestraContenidoDirectorio(archivo);
      }
    }
  }
}
