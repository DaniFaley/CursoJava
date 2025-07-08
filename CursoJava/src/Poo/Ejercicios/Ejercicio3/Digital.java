package Poo.Ejercicio;

public class Digital extends Videojuego {
    private Double pesoGB;
    private String claveActivacion;
    private String plataforma;

    public Digital(int id_videojuego, String nombre, String consola, String categoria, int cantidad, Double precio, Double pesoGB, String claveActivacion, String plataforma) {
        super(id_videojuego, nombre, consola, categoria, cantidad, precio);
        this.pesoGB = pesoGB;
        this.claveActivacion = claveActivacion;
        this.plataforma = plataforma;
    }

    public Double getPesoGB() {
        return pesoGB;
    }

    public String getClaveActivacion() {
        return claveActivacion;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPesoGB(Double pesoGB) {
        this.pesoGB = pesoGB;
    }

    public void setClaveActivacion(String claveActivacion) {
        this.claveActivacion = claveActivacion;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    // Polimorfismo: sobrescribe mostrarDatos
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Peso en GB: " + getPesoGB());
        System.out.println("Clave de Activación: " + getClaveActivacion());
        System.out.println("Plataforma: " + getPlataforma());
    }
}
