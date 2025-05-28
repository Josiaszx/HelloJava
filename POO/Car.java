package POO;

public class Car {
    // Una clase en java es un objeto

    // atributos
    String brandName;
    int maxSpeed;

    // constructor
    public Car (String brandName, int maxSpeed) {
        this.brandName = brandName;
        this.maxSpeed = maxSpeed;
        // el this se usa para hacer referencia a la variable definida anteriormente
    }


    // metodos
    public void acelarate() {
        System.out.println("El " + brandName + " acelera hasta " + maxSpeed + " km/h");
    }

}
