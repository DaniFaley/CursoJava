package Poo.Herencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 📦 Colección para almacenar objetos Alumno
        List<Alumno> coleccion_alumnos = new ArrayList<>();

        // 🧾 Solicitar cantidad de alumnos a registrar
        System.out.print("Ingresa la cantidad de alumnos: ");
        int cantidad_alumnos = scanner.nextInt();
        scanner.nextLine(); // 🧹 Limpiar salto de línea después de nextInt()

        // 🔁 Recolectar datos de cada alumno
        int id_alumno = 0;
        for (int x = 0; x < cantidad_alumnos; x++) {
            id_alumno++;

            System.out.print("Ingresa el nombre del alumno " + id_alumno + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa el apellido del alumno " + id_alumno + ": ");
            String apellido = scanner.nextLine();

            System.out.print("Ingresa el sexo (H/M) del alumno " + id_alumno + ": ");
            String sexo = scanner.nextLine();

            System.out.print("Ingresa la edad del alumno " + id_alumno + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // 🧹 Limpiar salto de línea

            System.out.print("Ingresa la matricula del alumno " + id_alumno + ": ");
            String matricula = scanner.nextLine();

            System.out.print("Ingresa la carrera del alumno " + id_alumno + ": ");
            String carrera = scanner.nextLine();

            System.out.print("Ingresa el semestre que esta cursando del alumno " + id_alumno + ": ");
            int semestre = scanner.nextInt();
            scanner.nextLine(); // 🧹 Limpiar salto de línea

            System.out.print("Ingresa la cantidad de materias del alumno " + id_alumno + ": ");
            int cantidad_materias = scanner.nextInt();
            scanner.nextLine(); // 🧹 Limpiar salto de línea

            // 📚 Recolectar calificaciones de cada materia
            int id_materia = 0;
            // 📦 Colección para almacenar las calificaciones del alumno
            List<Double> coleccion_calificaciones = new ArrayList<>();
            for (int i = 0; i < cantidad_materias; i++) {
                id_materia++;
                System.out.print("Ingresa tu calificación de la materia " + id_materia + ": ");
                Double calificacion = scanner.nextDouble();
                coleccion_calificaciones.add(calificacion);
                scanner.nextLine(); // 🧹 Limpiar salto de línea
            }

            // 🧱 Crear objeto Alumno y agregarlo a la lista
            Alumno alumno = new Alumno(nombre, apellido, sexo, edad, matricula, carrera, semestre, coleccion_calificaciones);
            coleccion_alumnos.add(alumno);
        }

        // 📄 Mostrar lista completa de alumnos
        imprimirLista(coleccion_alumnos);

        // 🔎 Buscar alumno por matrícula
        buscarAlumnoMatricula(coleccion_alumnos, scanner);

        // ❌ Eliminar alumno por matrícula (opcional)
        // eliminarAlumno(coleccion_alumnos);
    }

    // 📋 Imprimir lista completa de alumnos registrados.
    public static void imprimirLista(List<Alumno> coleccion_alumnos) {
        for (Alumno alumno : coleccion_alumnos) {
            System.out.println("-----------------------------");
            alumno.mostrarInfo();
            System.out.println("-----------------------------");
        }
    }

    // 🔍 Buscar un alumno en la lista por matrícula ingresada por el usuario.
    public static void buscarAlumnoMatricula(List<Alumno> coleccion_alumnos, Scanner scanner) {
        System.out.print("\n🔎 Ingresa la matrícula que deseas buscar: ");
        String matriculaBuscada = scanner.nextLine();
        boolean encontrado = false;

        for (Alumno alumno : coleccion_alumnos) {
            if (alumno.getMatricula().equalsIgnoreCase(matriculaBuscada)) {
                System.out.println("\n✅ Alumno encontrado:");
                alumno.mostrarInfo();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\n❌ No se encontró ningún alumno con esa matrícula.");
        }
    }

    // ❌ Eliminar un alumno de la lista mediante su matrícula.
    public static void eliminarAlumno(List<Alumno> coleccion_alumnos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("❌ Ingresa la matrícula del alumno que deseas eliminar: ");
        String matriculaEliminar = scanner.nextLine(); // ✅ String

        boolean encontrado = false;

        for (int i = 0; i < coleccion_alumnos.size(); i++) {
            if (coleccion_alumnos.get(i).getMatricula().equals(matriculaEliminar)) { // ✅ Comparación entre strings
                coleccion_alumnos.remove(i);
                System.out.println("✅ Alumno eliminado correctamente.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("⚠️ No se encontró ningún alumno con esa matrícula.");
        }
    }
}
