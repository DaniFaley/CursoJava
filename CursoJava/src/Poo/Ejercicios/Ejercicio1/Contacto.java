package Poo.Ejercicios.Ejercicio1;

/*
Instrucciones:
    Crear una clase: Contacto
    Atributos: Nombre, email y teléfono.
    Métodos:
        - Mostrar la lista de los contactos
        - Buscar un usuario mediante su correo electrónico => Mostrar la información de ese usuario
        - Agregar usuario
*/

public class Contacto {
    // 🔐 Atributos privados
    private int id;
    private String nombre;
    private String email;
    private String telefono;

    // 🧱 Constructor
    public Contacto(int id, String nombre, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    // 📥 Métodos get
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    // ✏️ Métodos set
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setEmail(String nuevoEmail) {
        this.email = nuevoEmail;
    }

    public void setTelefono(String nuevoTelefono) {
        this.telefono = nuevoTelefono;
    }

    // 📄 Método para mostrar los datos del contacto
    public void mostrarDatos() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Email: " + getEmail());
        System.out.println("Teléfono: " + getTelefono());
    }
}