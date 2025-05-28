package POO;

import POO.AnimalesHerencia.Dog;

public class Herencia {

    public static void main(String[] args) {
        var perro1 = new Dog("mamifero", "pitbull");

        perro1.eat(); // metodo heredado de la clase Animal
        perro1.play(); // metod propio de la clase Dog

    }

}


