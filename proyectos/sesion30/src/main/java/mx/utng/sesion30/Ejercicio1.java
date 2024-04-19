package mx.utng.sesion30;

import java.util.function.IntUnaryOperator;

public class Ejercicio1 {

    public Integer manipular(Iterable<Integer> conjunto, 
                             IntUnaryOperator transformacion){
        
        return conjunto.stream()
                       .mapToInt(s -> s)
                       .map(transformacion)
                       .sum();
    }

}
