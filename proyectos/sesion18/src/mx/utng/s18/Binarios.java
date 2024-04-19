package mx.utng.s18;

import java.io.BufferedInputStream; 
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binarios {

  public static void main(String[] args) throws FileNotFoundException, IOException {
    
    // Crear administrador de entrada de archivos binarios
    BufferedInputStream bis = new BufferedInputStream(
      new FileInputStream("C:\\proyectos\\sesion18\\src\\mx\\utng\\s18\\R (9).png"));
    
    // Crear administrador de salida de archivos binarios 
    BufferedOutputStream bos = new BufferedOutputStream(
      new FileOutputStream("C:\\proyectos\\sesion18\\src\\mx\\utng\\s18\\copia_R (9).png"));

    // Comenzar la copia
    byte[] buffer = new byte[2048];
    int bytesLeidos = 0;
    
    while((bytesLeidos = bis.read(buffer)) > 0) {
      bos.write(buffer, 0, bytesLeidos);
    }

    bis.close();
    bos.close();

  }

}