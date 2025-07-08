package Poo.Ejercicios.Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Videojuego> coleccion = new ArrayList<>();

        System.out.print("Ingresa la cantidad de videojuegos que deseas ingresar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        int id_videojuego = 0;
        for (int x = 0; x < cantidad; x++) {
            id_videojuego++;

            System.out.print("Ingresa el nombre del videojuego " + id_videojuego + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa la consola: ");
            String consola = scanner.nextLine();

            System.out.print("Ingresa la categoría: ");
            String categoria = scanner.nextLine();

            System.out.print("Ingresa la cantidad: ");
            int cantidad_videojuegos = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingresa el precio: ");
            Double precio = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Ingresa el peso en GB: ");
            Double pesoGB = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Ingresa la clave de activación: ");
            String claveActivacion = scanner.nextLine();

            System.out.print("Ingresa la plataforma: ");
            String plataforma = scanner.nextLine();

            // Se guarda como tipo padre (polimorfismo)
            Videojuego videojuego = new Digital(id_videojuego, nombre, consola, categoria, cantidad_videojuegos, precio, pesoGB, claveActivacion, plataforma);
            coleccion.add(videojuego);

            System.out.println("");
        }

        // Llamada a métodos
        obtenerLista(coleccion);
        // modificarPrecio(coleccion, scanner);
        // modificarCantidad(coleccion, scanner);
        buscarPorNombre(coleccion, scanner);
    }

    public static void obtenerLista(List<Videojuego> coleccion) {
        System.out.println("------ LISTA DE VIDEOJUEGOS ------");
        for (Videojuego videojuego : coleccion) {
            videojuego.mostrarDatos(); // Polimorfismo aquí
            System.out.println("");
        }
    }

    public static void modificarPrecio(List<Videojuego> coleccion, Scanner scanner) {
        System.out.print("Ingresa el ID del videojuego para modificar su precio: ");
        int id = scanner.nextInt();
        boolean encontrado = false;

        for (Videojuego videojuego : coleccion) {
            if (videojuego.getId_videojuego() == id) {
                System.out.print("Ingresa el nuevo precio: ");
                double nuevoPrecio = scanner.nextDouble();
                videojuego.setPrecio(nuevoPrecio);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("❌ El videojuego con ID " + id + " no existe.");
        }
    }

    public static void modificarCantidad(List<Videojuego> coleccion, Scanner scanner) {
        System.out.print("Ingresa el ID del videojuego para modificar su cantidad: ");
        int id = scanner.nextInt();
        boolean encontrado = false;

        for (Videojuego videojuego : coleccion) {
            if (videojuego.getId_videojuego() == id) {
                System.out.print("Ingresa la nueva cantidad: ");
                int nuevaCantidad = scanner.nextInt();
                videojuego.setCantidad(nuevaCantidad);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("❌ El videojuego con ID " + id + " no existe.");
        }
    }

    // ✅ Método para buscar videojuego por nombre
    public static void buscarPorNombre(List<Videojuego> coleccion, Scanner scanner) {
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingresa el nombre del videojuego que deseas buscar: ");
        String nombreBuscar = scanner.nextLine();

        boolean encontrado = false;
        for (Videojuego videojuego : coleccion) {
            if (videojuego.getNombre().equalsIgnoreCase(nombreBuscar)) {
                System.out.println("✅ Videojuego encontrado:");
                videojuego.mostrarDatos(); // Polimorfismo
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("❌ El videojuego con nombre \"" + nombreBuscar + "\" no existe.");
        }
    }
}