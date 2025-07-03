package Ejercicios;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada del número
        System.out.print("Ingresa el número para calcular su factorial: ");
        int dato = scanner.nextInt();

        int resultado = 1;

        // Calcular el factorial de forma descendente
        for (int x = dato; x > 0; x--) {
            resultado *= x;
        }

        // Mostrar resultado
        System.out.println("\nEl factorial de " + dato + " es: " + resultado);

        scanner.close();
    }
}