package TiposDatos.NoPrimitivos.Colecciones;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        // Creamos la colección
        // List<TipoDato> nombreColeccion = new ArrayList<>();
        java.util.List<String> coleccion = new ArrayList<>();

        // Agregamos elementos a la colección
        // nombreColeccion.add(valor);
        coleccion.add("Daniel");
        coleccion.add("Kim");
        coleccion.add("Lana");

        // Recorrer la List
        /*
        for (TipoDato iterador : coleccion) {
            System.out.println(iterador);
        }
        */
        System.out.println("List original:");
        for (String nombre : coleccion) {
            System.out.println(nombre);
        }

        // Modificar un elemento en específico
        // coleccion.set(posicion, valorElemento);
        coleccion.set(1, "X");
        System.out.println("Modificando un elemento (posición 1):");
        for (String nombre : coleccion) {
            System.out.println(nombre);
        }

        // Eliminar un elemento de la List
        // coleccion.remove(valorElemento);
        coleccion.remove("X");
        System.out.println("Eliminando un elemento (posición 1):");
        for (String nombre : coleccion) {
            System.out.println(nombre);
        }
    }
}