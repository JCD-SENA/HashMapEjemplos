package juanca.hashmapejemplos;

import java.util.HashMap;
import java.util.Iterator;

/*
Ejercicio 3

Un programa que decodifique un ascii en formato RLE (Run-Length Encoding) (Me estaba quedando sin ideas)
*/

public class Ejercicio3 {
    public static boolean esNum(char c) { // Sé que aun no vemos funciones pero esto me ayuda a simplificar.
        return c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9';
    }
    public static void main(String[] args) {
        String asci = "4a2b";
        HashMap<String, Integer> tabla = new HashMap<String, Integer>();
        int i=0, cant;
        do {
            if (esNum(asci.charAt(i))) {
                cant = asci.charAt(i) - '0';
                if (esNum(asci.charAt(i+1))) {
                    cant = (cant * 10) + (asci.charAt(i + 1) - '0');
                    i++;
                }
                tabla.put(Integer.toString(i)+asci.charAt(i+1), cant);
                i+=2;
            }
        } while(i<asci.length());
        Iterator<String> characters = tabla.keySet().iterator();
        while (characters.hasNext()) {
            String key = characters.next();
            for (i=0;i<tabla.get(key);i++) {
                System.out.print(key.charAt(1));
            }
        }
    }
}