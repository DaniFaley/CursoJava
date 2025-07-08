package Poo.Abstraccion.AbsInterface;

public class Cuadrado implements Figura {
    // Atributos
    private String nombre;
    private Double lado;
    
    // Constructor
    public Cuadrado(String nombre, Double lado) {
        this.nombre = nombre;
        this.lado = lado;
    }

    // Metodo: get
    public String getNombre() {
        return nombre;
    }
    public Double getLado() {
        return lado;
    }

    // Metodo: set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setLado(Double lado) {
        this.lado = lado;
    }

    // Implementacion de metodos
    @Override
    public Double calcularArea() {
        return lado * lado;
    }

    @Override
    public Double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Figura: " + getNombre());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}

