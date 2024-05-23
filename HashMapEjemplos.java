package juanca.hashmapejemplos;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/*
Ejercicio1

Rehacer el ejercicio 3 de HashTable
*/

public class HashMapEjemplos {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<String, String>();
        String key, contactsText, nombre, numero;
        int opt=0;
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog("1. Ver contactos\n2. Añadir contactos\n3. Remover contactos\n4. Salir"));
            switch (opt) {
                case 1:
                    if (contacts.size() > 0) {
                        contactsText = "";
                        for (Map.Entry<String, String> instancia : contacts.entrySet()) {
                            contactsText += instancia.getKey()+": "+instancia.getValue()+"\n";
                        }
                        JOptionPane.showMessageDialog(null, contactsText);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay contactos.");
                    }
                    break;
                case 2:
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto");
                    numero = JOptionPane.showInputDialog("Ingrese el número del contacto");
                    contacts.put(nombre, numero);
                    JOptionPane.showMessageDialog(null, "Contacto "+nombre+" añadido");
                    break;
                case 3:
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto a eliminar");
                    contacts.remove(nombre);
                    JOptionPane.showMessageDialog(null, "Contacto "+nombre+" removido");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Terminando ejecución");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } while (opt!=4);
    }
}
