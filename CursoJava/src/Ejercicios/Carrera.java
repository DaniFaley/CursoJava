package Ejercicios;

import java.util.*;

public class Carrera {
    public static void main(String[] args) {
        /*
         * Ejercicio: Clasificar a los participantes en distintas categorías según su edad.
         * Categorías:
         * Infantil: de 6 a 17 años
         * Adultos: de 18 a 50 años
         * Adultos mayores: mayores de 50 años
         */

        // Colección original de participantes (clave = ID, valor = edad)
        Map<Integer, Integer> coleccion_original = new HashMap<>();

        // Agregar participantes
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos usuarios quieres agregar: ");
        int cantidad_usuarios = scanner.nextInt();
        // Recolección de datos
        for (int i = 1; i <= cantidad_usuarios; i++) {
            System.out.println("\nUsuario #" + i);
            System.out.print("DNI: ");
            int dni = scanner.nextInt();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();

            if (edad < 6) {
                System.out.println("❌ Edad no válida. El usuario debe tener al menos 6 años.");
                continue;
            }
            coleccion_original.put(dni, edad);
        }

        // Colecciones por categoría
        List<Map<Integer, Integer>> coleccion_infantil = new ArrayList<>();
        List<Map<Integer, Integer>> coleccion_adultos = new ArrayList<>();
        List<Map<Integer, Integer>> coleccion_adultos_mayores = new ArrayList<>();

        // Clasificar participantes según su edad
        for (Map.Entry<Integer, Integer> usuario : coleccion_original.entrySet()) {
            if (usuario.getValue() >= 6 && usuario.getValue() <= 17) {
                // Agregar a categoría infantil
                Map<Integer, Integer> registro_actual = new HashMap<>();
                registro_actual.put(usuario.getKey(), usuario.getValue());
                coleccion_infantil.add(registro_actual);
            } else if (usuario.getValue() >= 18 && usuario.getValue() <= 50) {
                // Agregar a categoría adultos
                Map<Integer, Integer> registro_actual = new HashMap<>();
                registro_actual.put(usuario.getKey(), usuario.getValue());
                coleccion_adultos.add(registro_actual);
            } else if (usuario.getValue() > 50) {
                // Agregar a categoría adultos mayores
                Map<Integer, Integer> registro_actual = new HashMap<>();
                registro_actual.put(usuario.getKey(), usuario.getValue());
                coleccion_adultos_mayores.add(registro_actual);
            }
        }

        // Mostrar los resultados
        System.out.println("\nImpresion de listas por categoria: ");
        System.out.println("Categoría infantil: " + coleccion_infantil);
        System.out.println("Categoría adultos: " + coleccion_adultos);
        System.out.println("Categoría adultos mayores: " + coleccion_adultos_mayores);
    }
}
