package ObtenerDatos;

import java.util.Scanner;

public class DatosTeclado {
    // Método principal: el punto de entrada del programa
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // -----------------------------------------------
        // 1. Leer un número entero (tipo int)
        // -----------------------------------------------
        System.out.print("Ingresa un número entero: ");
        int numero_entero = scanner.nextInt(); // Lee el número y lo guarda

        // -----------------------------------------------
        // 2. Leer un número decimal (tipo double)
        // -----------------------------------------------
        System.out.print("Ingresa un número decimal: ");
        double numero_decimal = scanner.nextDouble(); // Lee el número y lo guarda

        // ⚠️ IMPORTANTE: Scanner deja un "Enter" pendiente en el buffer
        // Para evitar errores al leer cadenas completas después de números, limpiamos
        // el buffer
        scanner.nextLine();

        // -----------------------------------------------
        // 3. Leer una palabra (sin espacios) — tipo String
        // -----------------------------------------------
        System.out.print("Ingresa una sola palabra (sin espacios): ");
        String palabra = scanner.next(); // Lee hasta el primer espacio

        // ⚠️ Después de next(), también se recomienda limpiar el buffer
        scanner.nextLine();

        // -----------------------------------------------
        // 4. Leer un valor booleano (true o false)
        // -----------------------------------------------
        System.out.print("Ingresa true o false: ");
        boolean dato_boolean = scanner.nextBoolean(); // Lee un valor lógico

        // ⚠️ Otra limpieza de buffer antes de usar nextLine
        scanner.nextLine();

        // -----------------------------------------------
        // 5. Leer una oración completa (incluye espacios)
        // -----------------------------------------------
        System.out.print("Ingresa una oración completa: ");
        String cadena_completa = scanner.nextLine(); // Lee toda la línea

        // -----------------------------------------------
        // 6. Mostrar todos los datos ingresados
        // -----------------------------------------------
        System.out.println("\n------ RESULTADOS ------");
        System.out.println("Número entero: " + numero_entero);
        System.out.println("Número decimal: " + numero_decimal);
        System.out.println("Palabra ingresada: " + palabra);
        System.out.println("Valor booleano: " + dato_boolean);
        System.out.println("Oración completa: " + cadena_completa);
    }
}
