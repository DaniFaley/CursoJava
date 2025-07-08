package Poo.Ejercicios.Ejercicio2;

/*
Instrucciones:
    Crear una clase: Alumno
    Atributos: id, nombre, apellido, edad, calificación, aprobado/reprobado.
    Métodos:
        - Mostrar la lista de todos los alumnos
        - Mostrar la lista de los alumnos aprobados y reprobados
        - Agregar alumno
        - Eliminar un alumno por id
*/

public class Alumno {
    // 🔐 Atributos privados
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private Double calificacion;
    private Boolean estado;  // ✅ Se calcula automáticamente

    // 🧱 Constructor (calcula el estado automáticamente)
    public Alumno(int id, String nombre, String apellido, int edad, Double calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.calificacion = calificacion;
        this.estado = calcularAprobacion();
    }

    // 📥 Métodos get
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    // ✏️ Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
        this.estado = calcularAprobacion(); // ✅ Se recalcula automáticamente
    }

    // ✅ Calcular si está aprobado o no
    public Boolean calcularAprobacion() {
        return this.calificacion >= 7.0;
    }

    // 📄 Mostrar todos los datos del alumno
    public void mostrarDatos() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Calificación: " + getCalificacion());
        System.out.println("Estado: " + (getEstado() ? "Aprobado" : "Reprobado"));
    }
}