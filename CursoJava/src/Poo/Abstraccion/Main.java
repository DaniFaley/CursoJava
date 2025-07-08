package Poo.Abstraccion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figura> coleccion = new ArrayList<>();

        coleccion.add(new Cuadrado("Cuadrado",12.0));
        coleccion.add(new Rectangulo("Rectangulo",7.0,10.0));

        for (Figura figura : coleccion) {
            figura.mostrarDatos();
            System.out.println("-------------------");
        }
    }
}
