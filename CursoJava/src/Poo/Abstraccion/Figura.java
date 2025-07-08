package Poo.Abstraccion;

public abstract class Figura {
    // Atributos
    private String nombre;

    // Constructor
    public Figura (String nombre) {
        this.nombre = nombre;
    }

    // Metodo: get
    public String getNombre() {
        return nombre;
    }
    // Metodo: set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodos abstractos
    public abstract Double calcularArea();
    public abstract Double calcularPerimetro();
    public abstract void mostrarDatos();
}