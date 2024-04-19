package mx.utng.s09;

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
    
  
    public void setLitrosMaximos(short litrosMaximos) {
      this.litrosMaximos = litrosMaximos;
    }
  
    public void setLitrosActuales(short litrosActuales) {
      this.litrosActuales = litrosActuales;
    }
  
  }
    

