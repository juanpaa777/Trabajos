package mx.ej2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Texto {
    public static void main(String[] args) throws IOException {
  FileWriter fileWriter = new FileWriter(
    System.getProperty("user.home") + "/archivo.txt");
  BufferedWriter bw = new BufferedWriter(fileWriter);
  bw.write("Hola Manco");
  bw.newLine();
  bw.write("segunda linea");
  bw.newLine();
  bw.write("tercera linea");
  bw.write("\nFelis 14 de febrero");
  bw.close();

  java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(
    System.getProperty("user.home") + "/archivo.txt"));
    //Leer todo el archivo//
    String line = null;
    while ((line = br.readLine())!= null) {
        System.out.println(line);
    }

}
}



