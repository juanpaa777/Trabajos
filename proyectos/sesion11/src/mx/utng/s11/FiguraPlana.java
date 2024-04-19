package mx.utng.s11;

public class FiguraPlana {
    private final double BASE;
    private final double ALTURA;
    
    public FiguraPlana(double base, double altura){
        this.BASE=base;
        this.ALTURA=altura;

    }


    
    public double getBASE() {
        return BASE;
    }
    public double getALTURA() {
        return ALTURA;
    }
    

    
    public void mostrarDimension(){
        System.out.println("La base y la altura son: "+BASE+" y "+ALTURA);
    }
    
}
