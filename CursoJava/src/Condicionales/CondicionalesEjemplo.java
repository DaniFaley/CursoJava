package Condicionales;

import java.util.Scanner;

public class CondicionalesEjemplo {
    public static void main(String[] args) {
        /* Orden de ejecucion:
        If => Se ejecutara solamente si se cumple la condicion.
        Else if => Si la condicion del (If) no se cumple pasara a evaluar las condiciones del else if.
        Else => Si ninguna condicion se cumpel se ejecutara el codigo dentro del else
        */
        Scanner scanner = new Scanner(System.in);
        String estado = "";
        String etapa = "";

        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad < 18) {
            estado = "Menor de edad";
            etapa = "Niño";
        } else if (edad >= 18 && edad < 60) {
            estado = "Mayor de edad";
            etapa = "Adulto";
        } else {
            estado = "Mayor de edad";
            etapa = "Tercera edad";
        }

        System.out.println("Edad: " + edad);
        System.out.println("Estado: " + estado);
        System.out.println("Etapa: " + etapa);
    }
}