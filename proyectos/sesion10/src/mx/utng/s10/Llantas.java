package mx.utng.s10;

public class Llantas {
    private float ancho;
    private float diametro;
    private float presion;
  
    public float getAncho() {
      return ancho;
    }
  
    public float getDiametro() {
      return diametro; 
    }
  
    public float getPresion() {
      return presion;
    }
  
    public void setAncho(float ancho) {
      this.ancho = ancho;
    }
  
    public void setDiametro(float diametro) {
      this.diametro = diametro;
    }
  
    public void setPresion(float presion) {
      this.presion = presion;
    }
  
    public void rodar() {
     
    
    }
    @override 
    public boolean equals (objet obj) {
      if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
       
      Llanta that = (Llanta) obj;
      if (Float.copare(that.ancho, this.ancho)!= 0) 
      return false;
      if (Float.copare(that.diametro, this.diametro)!= 0) 
      return false;
      if (Float.copare(that.presion, this.presion)!= 0) 
      return false;
    }
  
  }

    

