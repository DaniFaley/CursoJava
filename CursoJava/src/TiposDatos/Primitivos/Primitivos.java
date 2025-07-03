package TiposDatos.Primitivos;

public class Primitivos {
    public static void main(String[] args) {
        // Tipos primitivos numéricos enteros
        byte edad = 25;              // 1 byte, rango: -128 a 127
        short anio = 2025;           // 2 bytes, rango: -32,768 a 32,767
        int numero = 100000;         // 4 bytes, rango: -2^31 a 2^31-1
        long poblacion = 8000000000L; // 8 bytes, se agrega 'L' al final

        // Tipos primitivos numéricos decimales
        float precio = 99.99f;       // 4 bytes, se agrega 'f' al final
        double salario = 12000.50;   // 8 bytes, mayor precisión

        // Tipo primitivo de carácter
        char inicial = 'D';          // 2 bytes, almacena un solo carácter Unicode

        // Tipo primitivo booleano
        boolean activo = true;       // 1 bit, true o false

        // Mostrar los valores
        System.out.println("Tipos primitivos:");
        System.out.println("byte: " + edad);
        System.out.println("short: " + anio);
        System.out.println("int: " + numero);
        System.out.println("long: " + poblacion);
        System.out.println("float: " + precio);
        System.out.println("double: " + salario);
        System.out.println("char: " + inicial);
        System.out.println("boolean: " + activo);
    }
}