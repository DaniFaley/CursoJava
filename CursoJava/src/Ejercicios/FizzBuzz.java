package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingresa el número inicial: ");
        int numero_inicial = scanner.nextInt();

        System.out.print("Ingresa el número final: ");
        int numero_final = scanner.nextInt();

        // Crear y llenar la colección con los números en el rango
        List<Integer> coleccion = new ArrayList<>();
        for (int x = numero_inicial; x <= numero_final; x++) {
            coleccion.add(x);
        }

        // Recorrer y aplicar la lógica FizzBuzz
        System.out.println("\nResultado FizzBuzz:");
        for (Integer numero : coleccion) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println(numero + ": FizzBuzz");
            } else if (numero % 3 == 0) {
                System.out.println(numero + ": Fizz");
            } else if (numero % 5 == 0) {
                System.out.println(numero + ": Buzz");
            } else {
                System.out.println(numero + ": Ninguno");
            }
        }

        scanner.close();
    }
}