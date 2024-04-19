package mx.utng.s10;

public class Combustible {
    private short litrosMaximos;
    private short litrosActuales;
  
    public short usar() {
        litrosActuales--;
        System.out.println("quedan" 
        + litrosActuales + "litros");
        return litrosActuales;
    }
  
    public short getLitrosActuales() {
      return litrosActuales;
    }
    public short getLitrosMaximos() {
        return litrosMaximos;
      }
    
  
    public Combustible() {
    }

    public void setLitrosMaximos(short litrosMaximos) {
      this.litrosMaximos = litrosMaximos;
    }
  
    public Combustible(short litrosMaximos, short litrosActuales) {
      this.litrosMaximos = litrosMaximos;
      this.litrosActuales = litrosActuales;
    }

    public void setLitrosActuales(short litrosActuales) {
      this.litrosActuales = litrosActuales;

    }
    @override
    public boolean equals (objet abj) {
      if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        if (getClass()!= obj.getClass())
            return
      
            combustible that = (combustible) obj:

            if (litrosActuales == that.litrosActuales);
    }
  
  
  }
    

