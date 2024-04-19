package mx.utng.sesion23.factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    @Override 
    public void log (String msg) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"));
            writer.write(msg);
            writer.close();
          }
        catch (IOException e){
            System.out.println("error de entrada y salida(I/O)"+e.getMessage());
    
       
    }
}
}
    