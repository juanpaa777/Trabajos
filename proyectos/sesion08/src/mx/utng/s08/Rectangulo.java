package mx.utng.s08;

public class Rectangulo {
    private double alto;
    private double ancho;

    
    
    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }



    public  Rectangulo(){
        this.alto=0;
        this.ancho=0;

    }
    public Rectangulo(double num){
        this.alto=num;
        this.ancho=num;
    }
    public Rectangulo(double alto,double ancho){
        this.alto=alto;
        this.ancho=ancho;


    }

    public double area(){
        return this.alto*this.ancho;


    }

    public static void main(String[] args) {
        Rectangulo rec1=new Rectangulo();
        double area1=rec1.area();

        Rectangulo rec2=new Rectangulo(2);
        double area2=rec2.area();

        Rectangulo rec3=new Rectangulo(3,2);
        double area3=rec3.area();


        System.out.println("El area del rectangulo es: "+area1);
        System.out.println("El area del rectangulo es: "+area2);
        System.out.println("El area del rectangulo es: "+area3);


    }

    



    
}
