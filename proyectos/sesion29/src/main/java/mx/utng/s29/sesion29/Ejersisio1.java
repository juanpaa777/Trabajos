package mx.utng.s29.sesion29;

import java.util.function.Function;

public class Ejersisio1 {
    
    private final Function<String, Integer> parser = Integer::parseInt;

    public Integer sumar(String a, String b) {
        return parser.apply(a) + parser.apply(b);
    }

    public static void main(String[] args) {
        Ejersisio1 ejersisio = new Ejersisio1();
        System.out.println(ejersisio.ya nomsumar("10", "20")); // Ejemplo de uso
    }
}
