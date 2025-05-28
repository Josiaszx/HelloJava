package POO;

public class Polimorfismo {
    // el polimorfismo es cuando un metodo se comporta de diferente manera dependiendo del contexto
    // pueden ser:
    // - por herencia (sobrescritura)
    // - por sobrecarga (mediante metodos)

    public static void main(String[] args) {
        var vehiculo = new Vehiculo();
        var moto = new Moto();

        vehiculo.capacity(); // metodo original
        moto.capacity(); // metodo heredado modificado

        var calc = new Calculator();
        System.out.println(calc.sum(1,2)); // --> 3
        System.out.println(calc.sum(1.4,2.9)); // --> 4.3
        System.out.println(calc.sum(1,2, 3)); // --> 6
        System.out.println(calc.sum(1,2, 3, 4)); // --> 10
    }


    // polimrfismo por herencia (sobrescritura)
    public static class Vehiculo {
        public void capacity() {
            System.out.println("La capacidad del vehiculos es de tantas personas");
        }
    }

    public static class Moto extends Vehiculo {
        @Override // @Override se usa como buena prectica a la hora de redefinir un metodo heredado
        public void capacity() {
            System.out.println("La capacidad del vehiculos es de 2 personas");
        }
    }


    // polimorfismo por sobrecarga
    public static class Calculator {
        public int sum(int a, int b) {
            return a + b;
        } // se ejecutará cuado tenga 2 parametros enteros

        public double sum(double a, double b) {
            return a + b;
        } // se ejecutará cuado tenga 2 parametros decimales

        public int sum(int a, int b, int c) {
            return a + b + c;
        } // se ejecutará cuado tenga 3 parametros enteros

        public int sum(int a, int b, int c, int d) {
            return a + b + c + d;
        } // se ejecutará cuado tenga 4 parametros enteros

    }

}
