package Poo.Abstraccion;

public class Rectangulo extends Figura {
    // Atributos
    private Double base;
    private Double altura;

    // Constructor
    public Rectangulo(String nombre, Double base, Double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Metodos abstractos
    @Override
    public Double calcularArea() {
        return base * altura;
    }

    @Override
    public Double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Figura: " + getNombre());  // Mostrar nombre usando el getter
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}