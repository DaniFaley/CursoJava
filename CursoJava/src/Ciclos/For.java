package Ciclos;

import java.util.ArrayList;
import java.util.List;

public class For {
    public static void main(String[] args) {
        // Crear una colección tipo List
        List<String> coleccion = new ArrayList<>();

        // Agregar elementos a la colección

        coleccion.add("Daniel");
        coleccion.add("Kim");
        coleccion.add("Lana");

        // Recorrer la colección con un ciclo for-each (forma más simple y legible)
        System.out.println("Recorrido con for-each:");
        for (String nombre : coleccion) {
            System.out.println(nombre);
        }

        // Recorrer la colección con un ciclo for tradicional (permite acceder al índice)
        System.out.println("\nRecorrido con for clásico:");
        for (int x = 0; x < coleccion.size(); x++) {
            System.out.println(coleccion.get(x));
        }
    }
}
