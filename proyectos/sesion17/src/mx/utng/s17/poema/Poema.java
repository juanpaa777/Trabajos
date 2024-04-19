package mx.utng.s17.poema;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Poema {
    
    public static void main(String[] args) throws IOException {
  FileWriter fileWriter = new FileWriter( "C:\\proyectos\\sesion17\\src\\mx\\utng\\s17\\poema\\Poema.txt");
  BufferedWriter bw = new BufferedWriter(fileWriter);
  bw.write("las rosas son rojas ");
  bw.newLine();
  bw.write("las violetas azules");
  bw.newLine();
  bw.write("tu me sonrrojas");
  bw.newLine();
  bw.write("por que la mas hermosa eres tu");
  bw.write("ayer te mire en la caye");
  bw.write("y te queria hablar");
  bw.newLine();
  bw.write("pero me dio mucha pena que me fuy a tirar");
  bw.newLine();
  bw.write("ahora tengo una gran pena");
  bw.newLine();
  bw.write("por que me dolo la condena");
  bw.newLine();
  bw.write("y ahora de ti me voy acordar");
  bw.newLine();
  bw.close();

  java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("C:\\proyectos\\sesion17\\src\\mx\\utng\\s17\\poema\\Poema.txt"));
    //Leer todo el archivo//
    String line = null;
    while ((line = br.readLine())!= null) {
        System.out.println(line);
    }
br.close();
}
}

