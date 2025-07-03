package TiposDatos.NoPrimitivos.Colecciones.Implementaciones.Map;

import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        // Crear la colección tipo Map<Key, Value>
        Map<String, Integer> coleccion = new java.util.LinkedHashMap<>();

        // Agregar elementos
        coleccion.put("Lana", 40);
        coleccion.put("Angela", 22);
        coleccion.put("Daniel", 23);

        // Mostrar colección original
        System.out.println("Colección original:");
        for (Map.Entry<String, Integer> usuario : coleccion.entrySet()) {
            System.out.println("Key: " + usuario.getKey() + " Value: " + usuario.getValue());
        }

        // Modificar el valor de una clave existente
        coleccion.put("Daniel", 30);
        System.out.println("\nColección modificada (valor de 'Daniel' actualizado):");
        for (Map.Entry<String, Integer> usuario : coleccion.entrySet()) {
            System.out.println("Key: " + usuario.getKey() + " Value: " + usuario.getValue());
        }

        // Eliminar un elemento por su clave
        coleccion.remove("Lana");
        System.out.println("\nColección modificada (elemento con key 'Lana' eliminado):");
        for (Map.Entry<String, Integer> usuario : coleccion.entrySet()) {
            System.out.println("Key: " + usuario.getKey() + " Value: " + usuario.getValue());
        }

        // Obtener tamaño de la colección
        System.out.println("\nTamaño de la colección: " + coleccion.size());

        // Verificar existencia de claves
        System.out.println("\n¿'Daniel' existe? " + coleccion.containsKey("Daniel"));
        System.out.println("¿'Ronaldo' existe? " + coleccion.containsKey("Ronaldo"));

        // Verificar existencia de valores
        System.out.println("¿Valor 22 existe? " + coleccion.containsValue(22));
        System.out.println("¿Valor 60 existe? " + coleccion.containsValue(60));

        // Mostrar solo las claves
        System.out.println("\nKeys en la colección: " + coleccion.keySet());

        // Mostrar solo los valores
        System.out.println("Values en la colección: " + coleccion.values());
    }
}

