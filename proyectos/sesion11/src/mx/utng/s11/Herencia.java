package mx.utng.s11;

public class Herencia {
    public static void main(String[] args) {
        Triangulo triangulo=new Triangulo(4, 5, "Estilo lite");
        System.out.println("Informacion sobre triangulo: ");
        triangulo.mostrarDimension();
        triangulo.mostrarEstilo();
        System.out.println("El area del triangulo es: "+ triangulo.area());


        
        Triangulo triangulo2=new Triangulo(10, 500, "Estilo Azul");
        System.out.println("Informacion sobre triangulo: ");
        triangulo2.mostrarDimension();
        triangulo2.mostrarEstilo();
        System.out.println("El area del triangulo es: "+ triangulo2.area());

        
        
        Triangulo triangulo3=new Triangulo(150, 300, "Estilo Rojo");
        System.out.println("Informacion sobre triangulo: ");
        triangulo3.mostrarDimension();
        triangulo3.mostrarEstilo();
        System.out.println("El area del triangulo es: "+ triangulo3.area());

    }
}
