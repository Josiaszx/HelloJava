package POO;

public class Composicion {
    // composicion es cuando queremos usar una clase dentro de otra pero siendo una carateristica de esa clase

    public static void main(String[] args) {
        var car = new Car();
        car.engine.turnOn();
        car.engine.turnOff();
    }

    public static class Engine {
        public void turnOn () {
            System.out.println("El motor se ha encendido");
        }
        public void turnOff() {
            System.out.println("El motor se ha apagado");
        }
    }

    public static class Car {
        Engine engine = new Engine();
        // como car no puede ser un hijo de Engine, se agrega una instancia de Engine para trabajar con ella
    }
}
