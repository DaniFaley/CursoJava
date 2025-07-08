package Poo.Abstraccion.AbsInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figura> coleccion = new ArrayList<>();

        coleccion.add(new Cuadrado("Cuadrado",10.0));
        coleccion.add(new Rectangulo("Rectangulo",10.0, 20.0));

        for (Figura figura : coleccion) {
            figura.mostrarDatos();
            System.out.println("-------------------");
        }
    }
}
