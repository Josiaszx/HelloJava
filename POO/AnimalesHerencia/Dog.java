package POO.AnimalesHerencia;

// El objeto Dog es hijo de Animal por lo que hereda sus atributos y metodos
public class Dog extends Animal{
    String race;

    public Dog(String type, String race){
        super(type); // super() hace referencia a la clase padre
        this.race = race;
    }

    public void play() {
        System.out.println("El perro juega");
    }

}
