package Poo.Ejercicios.Ejercicio4;

/*
Instrucciones:
    Crear una clase: Persona
    Atributos: id, curp, nombre, apellido, edad, estado (mayor/menor de edad)
    Métodos:
        - Calcular si es mayor de edad
        - Mostrar datos
        - Métodos get y set
*/

public class Persona {
    // 🔐 Atributos privados
    private int id;
    private String curp;
    private String nombre;
    private String apellido;
    private int edad;
    private String estado; // ✅ Se determina automáticamente según la edad

    // 🧱 Constructor
    public Persona(int id, String curp, String nombre, String apellido, int edad) {
        this.id = id;
        this.curp = curp;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estado = obtenerEstado(); // ⚙️ Se calcula al crear el objeto
    }

    // 🔎 Método para obtener si es mayor de edad
    public String obtenerEstado() {
        if (this.edad >= 18) {
            estado = "Mayor de edad";
        } else {
            estado = "Menor de edad";
        }
        return estado;
    }

    // 📥 Métodos get (acceder a los atributos)
    public int getId() {
        return id;
    }

    public String getCurp() {
        return curp;
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

    public String getEstado() {
        return estado;
    }

    // ✏️ Métodos set (modificar atributos)
    public void setCurp(String nuevoCurp) {
        this.curp = nuevoCurp;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setApellido(String nuevoApellido) {
        this.apellido = nuevoApellido;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
            this.estado = obtenerEstado(); // 🔄 Recalcula estado
        } else {
            System.out.println("⚠️ Edad inválida. No se asignó.");
        }
    }

    // 📄 Mostrar información de la persona
    public void mostrarDatosPersona() {
        System.out.println("ID: " + id);
        System.out.println("CURP: " + curp);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Estado: " + estado);
    }
}
