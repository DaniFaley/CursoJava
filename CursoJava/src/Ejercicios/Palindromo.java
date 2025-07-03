package Ejercicios;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de texto
        System.out.print("Ingresa un texto: ");
        String cadena_original = scanner.nextLine();

        // Normalizar: convertir a minúsculas y eliminar espacios
        String cadena_modificada = cadena_original.toLowerCase().replaceAll(" ", "");

        // Invertir la cadena
        String cadena_inversa = "";
        for (int x = cadena_modificada.length() - 1; x >= 0; x--) {
            cadena_inversa += cadena_modificada.charAt(x);
        }

        // Mostrar resultados
        System.out.println("\nTexto original: " + cadena_original);
        System.out.println("Texto procesado: " + cadena_modificada);
        System.out.println("Texto invertido: " + cadena_inversa);

        // Verificar si es palíndromo
        if (cadena_modificada.equals(cadena_inversa)) {
            System.out.println("Resultado: Es palíndromo ✅");
        } else {
            System.out.println("Resultado: No es palíndromo ❌");
        }

        scanner.close();
    }
}
