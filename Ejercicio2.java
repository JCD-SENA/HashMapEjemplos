package juanca.hashmapejemplos;

import java.util.HashMap;
import javax.swing.JOptionPane;

/*
Ejercicio 2

Un programa en el que el usuario rellena un formulario vacio con nombre, email y contraseña.
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        HashMap<String, String> usuario = new HashMap<String, String>();
        usuario.put("nombre", null);
        usuario.put("email", null);
        usuario.put("pass", null);
        JOptionPane.showMessageDialog(null, "Creación del usuario");
        usuario.put("nombre", JOptionPane.showInputDialog("Ingrese el nombre"));
        usuario.put("email", JOptionPane.showInputDialog("Ingrese el email"));
        usuario.put("pass", JOptionPane.showInputDialog("Ingrese la contraseña"));
    }
}
