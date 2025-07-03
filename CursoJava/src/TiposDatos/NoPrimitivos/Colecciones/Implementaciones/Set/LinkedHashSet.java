package TiposDatos.NoPrimitivos.Colecciones.Implementaciones.Set;

import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        // Crear la colección tipo Set (no permite duplicados y no tiene orden)
        Set<String> coleccion = new java.util.LinkedHashSet<>();

        // Agregar elementos
        coleccion.add("Lana");
        coleccion.add("Angela");
        coleccion.add("Daniel");

        // Mostrar colección original
        System.out.println("Colección original:");
        for (String nombre : coleccion) {
            System.out.println(nombre);
        }

        // Intentar modificar un elemento (no es posible modificar directamente)
        // Para "modificar", se debe eliminar y volver a agregar el nuevo valor
        coleccion.remove("Daniel");
        coleccion.add("Daniel Leyva");
        System.out.println("\nColección modificada ('Daniel' reemplazado por 'Daniel Leyva'):");
        for (String nombre : coleccion) {
            System.out.println(nombre);
        }

        // Eliminar un elemento
        coleccion.remove("Lana");
        System.out.println("\nColección modificada (elemento 'Lana' eliminado):");
        for (String nombre : coleccion) {
            System.out.println(nombre);
        }

        // Obtener tamaño de la colección
        System.out.println("\nTamaño de la colección: " + coleccion.size());

        // Verificar existencia de elementos
        System.out.println("\n¿'Angela' existe? " + coleccion.contains("Angela"));
        System.out.println("¿'Ronaldo' existe? " + coleccion.contains("Ronaldo"));
    }
}