package Poo.Herencia;

import java.util.List;

public class Alumno extends Persona {
    // 🧠 Atributos propios de la clase hija
    private String matricula;
    private String carrera;
    private int semestre;
    private Double promedio;
    private Boolean becado;
    private List<Double> coleccion_calificaciones;

    // Constructor de la clase hija: public ClassName(Atributos clase padre,Atributos de la clase hija) {}
    public Alumno(String nombre, String apellido, String sexo, int edad, String matricula, String carrera, int semestre, List coleccion_calificaciones) {
        // Llamar al constructor de la clase padre: Vas a poner solamente los atributos de la clase padre
        // super(atributoPadre1,atributoPadre2);
        super(nombre,apellido,sexo,edad);
        // Atributos propios de la clase hija
        this.matricula = matricula;
        this.carrera = carrera;
        this.semestre = semestre;
        this.coleccion_calificaciones = coleccion_calificaciones;
        this.promedio = obtenerPromedioIndividual();
        this.becado = obtenerBecado();
    }

    // 🔍 Métodos Get (Obtener valores) de la clase hija
    public String getMatricula() {
        return matricula;
    }
    public String getCarrera() {
        return carrera;
    }
    public int getSemestre() {
        return semestre;
    }
    public Double getPromedio() {
        return promedio;
    }
    public Boolean getBecado() {
        return becado;
    }
    public List<Double> getColeccion_calificaciones() {
        return coleccion_calificaciones;
    }

    // 🛠 Métodos Set (Modificar valores) de la clase hija
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public void setPromedio(Double promedio) {
        this.promedio = promedio;
        this.becado = obtenerBecado(); // Actualizar becado
    }
    public void setBecado(Boolean becado) {
        this.becado = becado;
    }
    public void setColeccion_calificaciones(List<Double> coleccion_calificaciones) {
        this.coleccion_calificaciones = coleccion_calificaciones;
    }

    //  🛠 Metodos de la clase hija: Operaciones

    // 📊 Calcular el promedio del alumno a partir de sus calificaciones
    public Double obtenerPromedioIndividual() {
        Double suma = 0.0;
        for (Double calificacion : coleccion_calificaciones) {
            suma = suma + calificacion;
        }
        if (coleccion_calificaciones.isEmpty()) {
            return 0.0;
        }
        return suma / coleccion_calificaciones.size();
    }

    // 🎓 Determinar si un alumno es becado en base al promedio
    public Boolean obtenerBecado() {
        if (promedio >= 95) {
            becado = true;
        } else {
            becado = false;
        }
        return becado;
    }

    // 📋 Metodo para mostrar datos
    public void mostrarInfo() {
        mostrarDatos(); // Metodo de la clase padre
        System.out.println(" ");
        System.out.println("Datos Escolares:");
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Carrera: " + getCarrera());
        System.out.println("Semestre: " + getSemestre());
        System.out.println("Promedio: " + getPromedio());
        System.out.println("becado: " + getBecado());
    }
}
