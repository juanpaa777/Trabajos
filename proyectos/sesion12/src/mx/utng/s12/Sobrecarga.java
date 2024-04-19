package mx.utng.s12;

public class Sobrecarga {
    public static void main(String [] args){
        Equipo equipo1 = new Equipo("Gamers","San Felipe", 0);
        Equipo equipo2 = new Equipo("CDMX");
        System.out.println(equipo2.toString());
        System.out.println(equipo1);
        equipo2.actualiza(10);
        equipo2.actualiza("Ratas");
        System.out.println(equipo2);


    }

    }
