package mx.utng.s;

public class Composicion {
    public static void main(String[] args) {


        Llanta llanta1=new Llanta();
        llanta1.setAncho(205);
        llanta1.setDiametro(16);
        llanta1.setPresion(35);

        Llanta llanta2=new Llanta();
        llanta2.setAncho(205);
        llanta2.setDiametro(16);
        llanta2.setPresion(35);

        Llanta llanta3=new Llanta();
        llanta3.setAncho(205);
        llanta3.setDiametro(16);
        llanta3.setPresion(35);

        Llanta llanta4=new Llanta();
        llanta4.setAncho(205);
        llanta4.setDiametro(16);
        llanta4.setPresion(35);

        Combustible combustible=new Combustible();
        combustible.setLitrosActuales((short)0);
        combustible.setLitrosMaximos((short)40);
        Automovil auto1=new Automovil("Ford", "Mustang", 2020, 30000);
        auto1.setCombustible(combustible);
        auto1.colocaLlantas(llanta1, llanta2, llanta3, llanta4);
        auto1.llenaTanque();

        for (int i = 0; i < 10; i++) {
            auto1.avanzar();
        }

        

    }
    

    
}
