package mx.utng.s08;

public class AutomovilFactory {
    public static void main(String[] args) {
        Automovil auto1= new Automovil("Ford","mustang",2000,12345);
        

        System.out.println("Auto1: hash:"+auto1.hashCode());

    }
    
}
