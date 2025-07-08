package Poo.ManejoErrores;

import java.io.FileReader;
import java.io.IOException;

public class ManejoArchivos {
    // Este método declara que puede lanzar una IOException
    public void leerArchivo() throws IOException {
        // Intenta abrir el archivo
        FileReader archivo = new FileReader("datos.txt");
        System.out.println("📁 Archivo leído correctamente.");

        // Cierra el archivo
        archivo.close();
    }
}