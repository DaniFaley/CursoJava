package TiposDatos.NoPrimitivos.Colecciones.ColeccionList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear coleccion
        List<String> coleccion = new ArrayList<>();

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

        // Acceder a un elemento: mediante la posicion
        System.out.println("Obtener el elemento con la pocision #0: " + coleccion.get(0));

        System.out.println();

        // Modificar el valor de un elemento: Accediendo por su posicion
        System.out.println("Coleccion version 2: Modificando el elemento en la posicion #0");
        coleccion.set(0,"Modificado");
        int count_estudiante2 = 0;
        // Recorrer la coleccion
        for (String estudiante:coleccion) {
            count_estudiante2++;
            System.out.println("Nombre del estudiante " + count_estudiante2 + ": " + estudiante);
        }

        System.out.println();

        // Eliminar elemento en especifico: Por posicion
        System.out.println("Coleccion version 3: Eliminando el elemento en la posicion #0");
        coleccion.remove(0);
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