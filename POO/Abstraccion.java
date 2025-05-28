package POO;

public class Abstraccion {
    // la abstraccion se logra con:
    // - clases abstractas
    // - interface

    public static void main(String[] args) {
        // var anyAnimal = new Animal(); --> error
        // No se puede inicializar anyAnimal porque la clase Animal es abstracta
        var dog = new Dog();
        // Aunque la clase Dog sea hija de Animal, esta si se puede instanciar porque no es abstracta
        dog.sleep();

        var bird = new Bird();
        bird.fly(); // el metodo fly() es implementado por: interface flyingAnimal
    }

    // Clases abstractas
    // una clase abstracta es una clase a la cual no le podemos hacer instancias
    // para definir una clase abstracta usamos la palabra reservada abstract
    public static abstract class Animal {
        public void sleep() {
            System.out.println("El Animal durme");
        }
    }

    public static class Dog extends Animal{}


    // Interface
    // una interface es como una plantilla que se puede agregar a las clases para agregar funcionalidades
    // para definirla usamos la palabra reservada interface
    interface flyigAnimal {
        void fly();
    }

    // para agregar el interface a una nueva clase usamos implements
    public static class Bird extends Animal implements flyigAnimal {
        @Override
        public void fly() {
            System.out.println("El animal vuela");
        }
    }
}
