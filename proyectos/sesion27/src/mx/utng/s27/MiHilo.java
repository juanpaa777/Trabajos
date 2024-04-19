/**
*@author <Juan Diego Pardo Zamarripa>
*@version <GDS0622>

*/
package mx.utng.s27;
import java.util.concurrent.TimeUnit;
//la clase hulo hereda de thrend 
public class MiHilo extends Thread{
private String parametro;
public void setParametro(String Parametro){
    this.parametro=Parametro;
}
    @Override
    public void run() {
        while (!"terminar".equals(parametro)){
            mostrarInfo();
            pausarUnSegundo();

        }
     
    }
    private void mostrarInfo(){
        String tipoHilo= isDaemon()?"Demon":"Usuario";
        System.out.println(tipoHilo+"\t nombre:"+getName()+"\t| ID:"+getId()+"\t|");


    }
    public static void pausarUnSegundo(){
        try{
            TimeUnit.SECONDS.sleep(1);

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
