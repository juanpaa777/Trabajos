package mx.utng.s16;

import java.io.File;
import java.io.IOException;

public class ArchivoTesdt {
    public static void main(String[] args) throws IOException {
        File archivo = new File("C:\\temp\\cursos");
        //consultar el nombre, ruta, directorio padre, si esta oculto //
        //si existe//
        System.out.println("Nombre del archivo: "+archivo.getName());
        System.out.println("Ruta: "+archivo.getPath());
        System.out.println("Ruta absoluta: "+archivo.getAbsolutePath());
        System.out.println(archivo.getCanonicalPath());
        System.out.println("Directorio: "+archivo.getParent());
        
        //verificar si existe//
        System.out.println("Existe?: "+(archivo.exists()?"Si": "No"));
        System.out.println("Es oculto? " +(archivo.isHidden()?"Si": "No"));
      
        //Tienes permisos de lectura, escritura, ejecucion del archivo//
        System.out.printf("%s puede escribir%n", (archivo.canWrite()?"Si": "No"));
        System.out.printf("%s puede Leer%n", (archivo.canRead()?"Si": "No"));
        System.out.printf("%s puede ejecutar %n", (archivo.canExecute()?"Si": "No"));
        System.out.printf("%s es directorio %n", (archivo.isDirectory()?"Si": "No"));
        System.out.printf("%.3s Bytes de tamaño %n", archivo.length()/1024.0);
        


    }

    
}



