package Poo.Ejercicio;

public class Videojuego {
    private int id_videojuego;
    private String nombre;
    private String consola;
    private String categoria;
    private int cantidad;
    private Double precio;
    private Double precio_final;

    public Videojuego(int id_videojuego, String nombre, String consola, String categoria, int cantidad, Double precio) {
        this.id_videojuego = id_videojuego;
        this.nombre = nombre;
        this.consola = consola;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
        this.precio_final = calcularPrecioFinal();
    }

    public int getId_videojuego() {
        return id_videojuego;
    }

    public String getNombre() {
        return nombre;
    }

    public String getConsola() {
        return consola;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public Double getPrecio_final() {
        return precio_final;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.precio_final = calcularPrecioFinal();
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
        this.precio_final = calcularPrecioFinal();
    }

    public Double calcularPrecioFinal() {
        return cantidad * precio;
    }

    // Método que puede ser sobrescrito
    public void mostrarDatos() {
        System.out.println("ID: " + getId_videojuego());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Consola: " + getConsola());
        System.out.println("Categoría: " + getCategoria());
        System.out.println("Cantidad: " + getCantidad());
        System.out.println("Precio Unitario: " + getPrecio());
        System.out.println("Precio Final: " + getPrecio_final());
    }
}
