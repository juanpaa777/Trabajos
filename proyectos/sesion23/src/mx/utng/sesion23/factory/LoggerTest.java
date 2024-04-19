package mx.utng.sesion23.factory;
import java.util.Scanner;

public class LoggerTest {
    public static void main(String[] args) {
        //crear un nuevo Logger factory
        LoggerFactory factory= new LoggerFactory();
        //el usuario tecleara el tipo 

        Scanner scanner =new Scanner (System.in);
        System.out.println("Teclea el tipo de Logger:\n 1=Archivo 2=Consola");
        int tipo =scanner.nextInt();
        scanner.close();
        //se crea el logger adecuado al elegido por e;l ususario 
        Logger logger= factory.getLogger(tipo);
        logger.log("registro de eventos del sistema");
    }
}
