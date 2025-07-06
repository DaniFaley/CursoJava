package Poo.Ejercicios.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("🔒 Atributos y métodos privados:");

        // 👤 Crear un objeto de la clase Persona
        Persona persona1 = new Persona(1, "LEFD020", "Daniel", "Leyva", 23);

        // 📄 Mostrar todos los datos
        persona1.mostrarDatosPersona();

        System.out.println("-------------------");
        System.out.println("🔎 Accediendo al valor de un atributo privado:");
        System.out.println(persona1.getNombre());

        System.out.println("-------------------");
        System.out.println("✏️ Modificando un valor:");
        persona1.setNombre("Luis");
        System.out.println(persona1.getNombre());
    }
}
