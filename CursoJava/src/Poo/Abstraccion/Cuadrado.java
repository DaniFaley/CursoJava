package Poo.Abstraccion;

public class Cuadrado extends Figura {
    // Atributos
    private Double lado;

    // Constructor
    public Cuadrado(String nombre, Double lado) {
        super(nombre);
        this.lado = lado;
    }

    // Metodos abstractos
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
        System.out.println("Figura: " + getNombre());  // Usamos el getter para acceder al nombre
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}