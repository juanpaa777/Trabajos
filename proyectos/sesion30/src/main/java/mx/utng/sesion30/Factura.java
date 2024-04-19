package mx.utng.sesion30;

public class Factura {
    private String concepto;
    private int importe;
    private double total;

    public Factura(String concepto, int importe) {
        this.concepto = concepto;
        this.importe = importe;
        
    }

    public String getConcepto() {
        return concepto;
    }

    public String getImporte() {
        return String.valueOf(importe);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    @Override 
    public String toString(){
        return concepto + "-" +importe;
    }
} 
