package mx.utng.s10;

public class PruevaEquals {
    public static void main (String[] args) {
        Llanta llanta1 = new Llantas (205, 16, 35);
        Llanta llanta2 = new Llantas (205, 16, 35);
        Llanta llanta3 = new Llantas (205, 16, 35);
        Llanta llanta4 = new Llantas (205, 16, 35);
        Combustible combustible1 = new Combustible((short)40, (short)0);
        Automovil auto1 = new Automovil ("Ford", "Mustang", 2020, 30000, llanta1, llanta2, llanta3, llanta4, combustible1);
        Automovil1.setCombustible1(combustible1);
        Automovil.colocaLlantas(llanta1, llanta2, llanta3, llanta4);
        Automovil1.llenaTanque();

        Llanta llanta5 = new Llantas (205, 16, 35);
        Llanta llanta6 = new Llantas (205, 16, 35);
        Llanta llanta7 = new Llantas (205, 16, 35);
        Llanta llanta8 = new Llantas (205, 16, 35);

        Automovil2 auto1 = new Automovil ("Ford", "Mustang", 2020, 30000, llanta5, llanta6, llanta7, llanta, combustible1);
        Automovil2.setCombustible1(combustible1);
        Automovil2.colocaLlantas(llanta1, llanta2, llanta3, llanta4);
        Automovil2.llenaTanque();

        System.out.printlm(automovil1.equials)

}
}
