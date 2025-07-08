package Poo.Encapsulamiento;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto
        Persona persona1 = new Persona("Daniel","Leyva","Hombre",23);
        Persona persona2 = new Persona("Mateo","Zabala","Hombre",10);

        // Mostrar datos
        persona1.mostrarDatos();

        System.out.println("");

        persona2.mostrarDatos();

        System.out.println("");

        // Accediendo a un atributo mediante el get
        System.out.println("Accediendo al atributo nombre: " + persona1.getNombre());

        System.out.println("");

        // Metodo set: Modificando el atributo nombre
        persona1.setNombre("Lana");
        persona1.setEdad(10);

        // Mostrar datos
        System.out.println("Modificando el nombre y la edad con el metodo set: ");
        persona1.mostrarDatos();
    }
}
