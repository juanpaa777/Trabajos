package mx.utng.s10.ej01;

public class MiembrosEstaticos {
    public static void main(String[] args) {
        Contador cont1= new Contador();
        Contador cont2= new Contador();
        Contador cont3= new Contador();
        Contador cont4= new Contador();

        cont1 

        System.out.println("Contador 1 clase: " + Contador.getContadorClase());
        System.out.println("Contador 1,instancia: " + Contador.getContadorClase());
        
        System.out.println("Contador 2,clase: " + Contador.getContadorClase());
        System.out.println("Contador 2,instancia: " + Contador.getContadorClase());

        System.out.println("Contador 3,clase: " + Contador.getContadorClase());
        System.out.println("Contador 3,instancia: " + Contador.getContadorClase());

        System.out.println("Contador 4,clase: " + Contador.getContadorClase());
        System.out.println("Contador 4,instancia: " + Contador.getContadorClase());

        System.out.println("Contador 5,clase: " + Contador.getContadorClase());
        System.out.println("Contador 5,instancia: " + Contador.getContadorClase());
        

}
}