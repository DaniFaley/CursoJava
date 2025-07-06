package Poo.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal miAnimal1 = new Perro();
        Animal miAnimal2 = new Gato();

        miAnimal1.hacerSonido();
        miAnimal2.hacerSonido();
    }
}
