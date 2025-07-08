package TiposDatos.NoPrimitivos.Colecciones.Implementaciones.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Estudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear coleccion
        Map<String,Integer> coleccion = new HashMap<>();

        // Agregar elementos
        // Cantidad de nombres que ingresara el usuario
        System.out.print("Ingresa la cantidad de alumnos que agregaras: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // 🧹 Limpiar salto de línea
        // Pedir nombres
        int id_estudiante = 0;
        for (int x = 0; x < cantidad; x++) {
            id_estudiante++;
            System.out.print("Ingresa el nombre del estudiante " + id_estudiante + ": ");
            String nombre = scanner.nextLine();
            System.out.print("Ingresa la edad del estudiante " + id_estudiante + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // 🧹 Limpiar salto de línea
            // Agregando el nombre a la coleccion
            coleccion.put(nombre,edad);
        }

        System.out.println();

        // Recorrer la coleccion
        System.out.println("Coleccion version 1: ");
        for (Map.Entry<String,Integer> estudiante:coleccion.entrySet()) {
            System.out.println("El estudiante con el nombre " + estudiante.getKey() + " tiene la edad de " + estudiante.getValue());
        }

        System.out.println();

        // Tamaño
        System.out.print("Tamaño de la coleccion: " + coleccion.size());

        System.out.println();

        // Eliminar elemento en especifico: Buscara el elemento por su Key y lo eliminara
        coleccion.remove("Kim");
        // Recorrer la coleccion
        System.out.println("Coleccion version 2: Eliminando el elemento con la key (Kim)");
        for (Map.Entry<String,Integer> estudiante:coleccion.entrySet()) {
            System.out.println("El estudiante con el nombre " + estudiante.getKey() + " tiene la edad de " + estudiante.getValue());
        }

        System.out.println();

        // Verificar si una key existe dentro de la coleccion
        System.out.println("¿Existe la key (Daniel) dentro de la coleccion? " + coleccion.containsKey("Daniel"));

        // Verificar si un value existe dentro de la coleccion
        System.out.println("¿Existe el value 23 dentro de la coleccion? " + coleccion.containsValue(23));

        System.out.println();

        // Obtener el value mediante una key
        System.out.println("Obteniendo la edad del estudiante Daniel: " + coleccion.get("Daniel"));

        System.out.println();

        // Obtener todas las key de la coleccion
        System.out.println("Todas las key: ");
        System.out.println(coleccion.keySet());

        System.out.println();

        // Obtener todos los values de la coleccion
        System.out.println("Todos los values: ");
        System.out.println(coleccion.values());

        System.out.println();

        //Obtener un conjunto de pares key-value
        System.out.println("Todas los elementos key-value: ");
        System.out.println(coleccion.entrySet());
    }
}
