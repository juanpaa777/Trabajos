package mx.utng.s14.ej2;



import mx.utng.s14.overide;

public class Numero {
    private String nombre;
	public char[] getNombre;

    public Numero(String nombre){
    this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    @overide 
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null||  getClass()!=obj.getClass()) return false;
        Numero numero = (Numero)obj;
        return nombre!=null?nombre.equals(numero.getNombre()): numero.nombre==null;

    }
    @overide
    public int hashCode(){
        return nombre!=null?nombre.hashCode():0;
    }
}
