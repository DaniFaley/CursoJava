package Poo.Encapsulamiento;

public class Persona {
    // Atributos de la clase padre
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    private Boolean mayorEdad;

    // Constructor
    public Persona(String nombre, String apellido, String sexo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.mayorEdad = obtenerMayorEdad();
    }

    // Metodos get de la clase padre
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public int getEdad() {
        return edad;
    }
    public Boolean getMayorEdad() {
        return mayorEdad;
    }

    // Metodos set de la clase padre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setEdad(int edad) {
        this.edad = edad;
        this.mayorEdad = obtenerMayorEdad();
    }

    // Metodos extras: Operaciones
    // Metodo para saber si es mayor de edad una persona
    public Boolean obtenerMayorEdad() {
        if (edad >= 18) {
            mayorEdad = true;
        } else {
            mayorEdad = false;
        }
        return mayorEdad;
    }
    // Metodo para mostrar datos
    public void mostrarDatos() {
        System.out.println("Datos Personales:");
        System.out.println("Nombre completo: " + getNombre() + " " + getApellido());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Edad: " + getEdad());
        System.out.println("¿Es mayor de edad? " + getMayorEdad());
    }
}