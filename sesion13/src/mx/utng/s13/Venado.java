package mx.utng.s13;

public class Venado extends Animal implements Hervivoro {
    private boolean tieneCuernos; 

    @Override 
    public void respirar() {
        System.out.println("Respirando...");
    }
    @Override
    public void comer() {
        System.out.println("Comiendo...");
    }
    public boolean isTrieneCuernos() {
        return tieneCuernos;
    }
    public void setTrieneCuernos(boolean tieneCuernos) {
        this.tieneCuernos = tieneCuernos;
    }
}
