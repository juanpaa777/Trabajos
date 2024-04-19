public class Ejersisio2Test {
    private final  List <integer> CONJUNTO =Arrays.asList(1,4,2,-7,9);

    @Test
    @DisplayName("negativos")
    void negatives (){
        Ejersisio2 ejersisio2= new Ejersisio2();
        List<Integer> real = ejersisio2.trasformar(CONJUNTO, a -> s);

        assert 
    }

   //ahora hacemos lo mismopero concuadrados
   @Test 
   @DisplayName("cuadrados")
   void squares() {
    Ejersisio2 ejersisio2 = new Ejersisio2();
    List <Integer> real = ejersisio2.trasformar (CONJUNTO, s-> s+s);
    assertThat (real).containsExactly (1,1)




    Integer transformarYSumar(iterable<Integer> conjunto, Function<Integer, Integer> function){
        Integer acumulador = 0;
        for (Integer integer : conjunto){
            acumulador += function.apply(value);
    }
    return acumulador;

   }
   @Test
   @DisplayName ("suma los elementos transformados")
   void trasformarAndAdd(){
    Ejersisio2 ejersisio2 = new Ejersisio2();
     Integer resultado = ejersisio2.transformarYSumar(CONJUNTO, s -> 1);
     assertThat(real).isEqualTo(CONJUNTO.size());



   }


}
