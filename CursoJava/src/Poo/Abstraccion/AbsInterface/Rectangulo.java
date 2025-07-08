package Poo.Abstraccion.AbsInterface;

public class Rectangulo implements Figura {
    // Atributos
    private String nombre;
    private Double base;
    private Double altura;

    // Constructor
    public Rectangulo(String nombre, Double base, Double altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    // Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    // Implementación de métodos de la interfaz
    @Override
    public Double calcularArea() {
        return base * altura;
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Figura: " + getNombre());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
