package TiposDatos.NoPrimitivos;

public class Array {
    public static void main(String[] args) {
        // Crear un arreglo de enteros
        int[] lista = {1, 2, 3, 4, 5};

        // Mostrar elementos del arreglo
        System.out.println("Contenido del arreglo:");
        for (int elemento : lista) {
            System.out.println(elemento);
        }

        // Mostrar tamaño del arreglo
        System.out.println("\nTamaño del arreglo: " + lista.length);
    }
}
