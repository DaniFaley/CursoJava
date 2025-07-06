package Poo.Ejercicios.Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 📦 Lista para almacenar los contactos
        List<Contacto> coleccion = new ArrayList<>();

        System.out.print("👤 Ingresa la cantidad de usuarios: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // 🧹 Limpiar el salto de línea después de nextInt()

        int id = 0;

        // 🔁 Capturar datos de los contactos
        for (int x = 0; x < cantidad; x++) {
            id++;

            System.out.print("📛 Ingresa el nombre del usuario " + id + ": ");
            String nombre = scanner.nextLine();

            System.out.print("📧 Ingresa el email: ");
            String email = scanner.nextLine();

            System.out.print("📱 Ingresa el teléfono: ");
            String telefono = scanner.nextLine();

            System.out.println("--------------------------------");

            // ➕ Crear objeto y agregarlo a la lista
            Contacto contacto = new Contacto(id, nombre, email, telefono);
            coleccion.add(contacto);
        }

        // 📋 Mostrar todos los contactos
        obtenerLista(coleccion);

        // 🔍 Buscar un contacto por correo
        buscarContactoPorCorreo(coleccion, scanner);

        // 🔒 Cerrar el scanner al final
        scanner.close();
    }

    // 📄 Método para mostrar la lista completa de contactos
    public static void obtenerLista(List<Contacto> coleccion) {
        System.out.println("--------------------------------");
        System.out.println("📘 Lista de contactos:");
        for (Contacto contacto : coleccion) {
            contacto.mostrarDatos();
            System.out.println("--------------------------------");
        }
    }

    // 🔍 Método para buscar un contacto por su email
    public static void buscarContactoPorCorreo(List<Contacto> coleccion, Scanner scanner) {
        System.out.print("\n🔎 Ingresa el correo que deseas buscar: ");
        String correoBuscado = scanner.nextLine();
        boolean encontrado = false;

        for (Contacto contacto : coleccion) {
            if (contacto.getEmail().equalsIgnoreCase(correoBuscado)) {
                System.out.println("\n✅ Contacto encontrado:");
                contacto.mostrarDatos();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\n❌ No se encontró ningún contacto con ese correo.");
        }
    }
}