package TiposDatos.NoPrimitivos.Colecciones.Implementaciones.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Estudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear coleccion
        Set<String> coleccion = new HashSet<>();

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
            // Agregando el nombre a la coleccion
            coleccion.add(nombre);
        }

        System.out.println();

        // Recorrer la coleccion
        System.out.println("Coleccion version 1: ");
        int count_estudiante = 0;
        for (String estudiante:coleccion) {
            count_estudiante++;
            System.out.println("Nombre del estudiante " + count_estudiante + ": " + estudiante);
        }

        System.out.println();

        // Tamaño
        System.out.println("Tamaño de la coleccion: " + coleccion.size());

        System.out.println();

        // Eliminar elemento en especifico: Por su valor
        System.out.println("Coleccion version 2: Eliminando el elemento por su valor (Kim)");
        coleccion.remove("Kim");
        int count_estudiante3 = 0;
        // Recorrer la coleccion
        for (String estudiante:coleccion) {
            count_estudiante3++;
            System.out.println("Nombre del estudiante " + count_estudiante3 + ": " + estudiante);
        }

        System.out.println();

        // Verificar si un elemento existe dentro de la coleccion: Mediante su valor
        System.out.println("¿Existe el nombre (Daniel) dentro de la coleccion? " + coleccion.contains("Daniel"));

        // Verificar si la coleccion esta vacia: Devuelve true/false
        System.out.println("¿La coleccion esta vacia? " + coleccion.isEmpty());
    }
}