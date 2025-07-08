package Poo.ManejoErrores;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Manejo del error: Excepcion
        try {
            // Código que puede fallar
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        }
        catch (ArithmeticException e) {
            // Código que se ejecuta si ocurre una excepción
            // System.out.println("No se puede dividir un numero entre 0");
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            // Opcional: siempre se ejecuta (haya o no excepción)
            System.out.println("Final de la ejecucion");
        }

        // Throws
        // Crear instancia de la clase
        ManejoArchivos lector = new ManejoArchivos();

        try {
            // Llamar al método que lanza una excepción
            lector.leerArchivo();
        } catch (IOException e) {
            // Captura y maneja la excepción
            System.out.println("❌ Ocurrió un error al leer el archivo: " + e.getMessage());
        }
        System.out.println("✅ El programa continúa...");
    }
}