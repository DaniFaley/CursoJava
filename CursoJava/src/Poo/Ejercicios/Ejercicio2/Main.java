package Poo.Ejercicios.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 📦 Lista de alumnos
        List<Alumno> coleccion = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // 👥 Ingreso de datos
        System.out.print("📚 Ingresa la cantidad de alumnos: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // 🧹 Limpiar el salto de línea

        int id = 0;
        for (int x = 0; x < cantidad; x++) {
            id++;
            System.out.print("🧑 Ingresa el nombre del alumno " + id + ": ");
            String nombre = scanner.nextLine();

            System.out.print("🧑 Ingresa el apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("🎂 Ingresa la edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.print("📝 Ingresa la calificación: ");
            Double calificacion = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("-----------------------------");

            // ➕ Crear alumno y agregarlo a la lista
            Alumno alumno = new Alumno(id, nombre, apellido, edad, calificacion);
            coleccion.add(alumno);
        }

        // 📋 Mostrar lista completa
        obtenerLista(coleccion);

        // ✅ Mostrar alumnos aprobados y reprobados
        obtenerEstadoAlumno(coleccion);

        // ❌ Eliminar alumno por ID
        eliminarAlumno(coleccion);

        // 📋 Mostrar lista actualizada
        obtenerLista(coleccion);

        scanner.close();
    }

    // 📄 Mostrar todos los alumnos
    public static void obtenerLista(List<Alumno> coleccion) {
        System.out.println("🚥 Lista de alumnos:");
        for (Alumno alumno : coleccion) {
            alumno.mostrarDatos();
            System.out.println("-----------------------------");
        }
    }

    // ✅ Mostrar aprobados y reprobados por separado
    public static void obtenerEstadoAlumno(List<Alumno> coleccion) {
        List<Alumno> aprobados = new ArrayList<>();
        List<Alumno> reprobados = new ArrayList<>();

        for (Alumno alumno : coleccion) {
            if (alumno.getEstado()) {
                aprobados.add(alumno);
            } else {
                reprobados.add(alumno);
            }
        }

        // Mostrar aprobados
        System.out.println("📘 Alumnos Aprobados:");
        for (Alumno alumno : aprobados) {
            System.out.println(alumno.getNombre() + " " + alumno.getApellido());
            System.out.println("-----------------------------");
        }

        // Mostrar reprobados
        System.out.println("📕 Alumnos Reprobados:");
        for (Alumno alumno : reprobados) {
            System.out.println(alumno.getNombre() + " " + alumno.getApellido());
            System.out.println("-----------------------------");
        }
    }

    // ❌ Eliminar alumno por ID
    public static void eliminarAlumno(List<Alumno> coleccion) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("❌ Ingresa el ID del alumno que deseas eliminar: ");
        int idEliminar = scanner.nextInt();
        scanner.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i).getId() == idEliminar) {
                coleccion.remove(i);
                System.out.println("✅ Alumno eliminado correctamente.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("⚠️ No se encontró ningún alumno con ese ID.");
        }
    }
}