
package test;

import Genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(30);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Alex");
        objetoString.obtenerTipo();
    }
}
