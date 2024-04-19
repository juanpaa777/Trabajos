package mx.utng.s14.ej2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colecciones {
    public static void main (String[] args){
        List<String>  listaCadenas= new ArrayList<>();
        System.out.println(listaCadenas.isEmpty());

        listaCadenas.add("venado");
        listaCadenas.add("ornitorrinco");
        listaCadenas.add("Gato");
        listaCadenas.add("Aguilla");
        //imprime la lista con todos los elementos//
        System.out.println(listaCadenas);

        //imprimir cada linea con salto de linea//
        for (int i = 0; i  < listaCadenas.size(); i++)
        System.out.println(listaCadenas.get(i));

        //imprime el foreach//

    for(String cadena : listaCadenas){
        System.out.println(cadena);
    }
    //uso de un conjunto//
    Set<String> conjuntoCadenas = new HashSet<>();
    listaCadenas.add("venado");
    listaCadenas.add("ornitorrinco");
    listaCadenas.add("Gato");
    listaCadenas.add("Aguilla");
    for (String cadena: conjuntoCadenas) {
        System.out.println(cadena);
    }

    List<Numero> listaNumeros = new ArrayList<>();
    listaNumeros.add(new Numero("uno"));
    listaNumeros.add(new Numero("dos"));
    listaNumeros.add(new Numero("tres"));
    listaNumeros.add(new Numero("cuatro"));
    for (Numero numero :listaNumeros){
        System.out.println(numero.getNombre());

        Set<Numero> setNumeros = new HashSet<>();
        setNumeros.add(new Numero("uno"));
        setNumeros.add(new Numero("dos"));
        setNumeros.add(new Numero("dos"));
        setNumeros.add(new Numero("tres"));
        setNumeros.add(new Numero("tres"));
        setNumeros.add(new Numero("cuatro"));
        System.out.println("===SET de numeros===");
        
            System.out.println(numero.getNombre());
    }
}
    }


