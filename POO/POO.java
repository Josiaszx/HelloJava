package POO;

public class POO {
    // Una clase en java es un objeto

    public static void main(String[] args) {
        // De la clase Car:
        Car fiat = new Car("Fiat", 180);
        // Se define una instancia auto de Car con los siguientes atributos:
        // brandName = "Fiat"
        // maxSpeed = 180

        System.out.println(fiat.brandName); // --> Fiat
        System.out.println(fiat.maxSpeed); // --> 180

        fiat.acelarate(); // accediendo al metodo acelerate() de Car

    }
}

