

public class Ejersisio2 {
   list  <Integer> trasformar(iterable <Integer> CONJUNTO,
   Function<Integer, Integer> function) {

    list <Integer> nuevaLista = new ArrayList<>();
    for (Integer value : CONJUNTO){
        nuevaLista.add(function.apply(value));
    }
    return nuevaLista;
   }

}
