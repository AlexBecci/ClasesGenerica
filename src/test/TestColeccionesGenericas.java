package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {

        //<> = notacion de diamante
        List<String> miLista = new ArrayList<>();
        //miLista.add(20); ERROR porque  no es de tipo String       
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        String elemento = miLista.get(0);
        //imprimir(miLista);

        //Convertir tipo set a generics
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        miSet.add("Domingo");
        //imprimir(miSet);

        //MAP
        //Convertir map a generico
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("Valor1", "Alex");
        miMapa.put("Valor2", "Lourdes");
        miMapa.put("Valor3", "Canserbero");
        //Si repetimos una key como por ejemplo "Valor3". 
        //esta se remplazara por la ultima que se agrege ya que es un set no se puede repetir
        //Entonces en vez de "Canserbero", la key tomara el valor de "Messi",en este caso
        miMapa.put("Valor3", "Messi");

        //String elementoMapa = (String) miMapa.get("Valor1");
        String elementoMapa = miMapa.get("Valor3");
        //System.out.println("elemento = " + elementoMapa);

        //Devuelve todas las llaves pero no garantiza el orden
        imprimir(miMapa.keySet());
        //Devuelve todos los valores asociados a las keys en orden segun las keys asociadas.
        imprimir(miMapa.values());
    }

    //Funciona solo si implementa <String> de caso contrario no imprimira nada
    public static void imprimir(Collection<String> coleccion) {
//        coleccion.forEach(elemento
//                -> {
//            System.out.println("elemento = " + elemento);
//        });
        for (String elemento : coleccion) {
            System.out.println("elemento = " + elemento);
        }
    }
}
