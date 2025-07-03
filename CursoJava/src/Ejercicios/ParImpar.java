package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // Crear listas para todos los números, pares e impares
        List<Integer> coleccion = new ArrayList<>();
        List<Integer> coleccion_par = new ArrayList<>();
        List<Integer> coleccion_impar = new ArrayList<>();

        // Entrada de datos por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el dato menor: ");
        int dato_menor = scanner.nextInt();
        System.out.print("Ingresa el dato mayor: ");
        int dato_mayor = scanner.nextInt();

        // Llenar la lista con los números en el rango
        for (int x = dato_menor; x <= dato_mayor; x++) {
            coleccion.add(x);
        }

        System.out.println("Lista original: " + coleccion);

        // Separar números pares e impares
        for (Integer numero : coleccion) {
            if (numero % 2 == 0) {
                coleccion_par.add(numero);
            } else {
                coleccion_impar.add(numero);
            }
        }

        // Mostrar resultados
        System.out.println("Lista pares: " + coleccion_par);
        System.out.println("Lista impares: " + coleccion_impar);

        scanner.close(); // Cerrar el Scanner
    }
}
