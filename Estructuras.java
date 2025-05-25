import java.util.ArrayList;

public class Estructuras {
    public static void main(String[] args) {

        // arrays
        //  - !! En java los arrays no pueden variar su longitud, no se pueden agregar ni eliminar elementos !!
        int[] numbers = {1, 2, 3, 4};
        // agregando [] a int creamos un array de tipo entero
        String[] names = {"Josias", "Abner"};
        // names es un array de tipo string
        // para crear un array con una cantidad determinada de elementos usamos:
        int[] definedNumbers = new int[3];
        // este array reserva 3 ubicaciones en memoria para 3 elementos inicializandolos en 0 en caso de los int



        // ArrayList
        //  - lista parecida a un array con la capacidad de tener una longitud que variable
        //  - ArrayList está incluida en el paquete java.util
        ArrayList<Integer> variableNumbers = new ArrayList<>();
        // ArrayList<Integer> define a la variableNumbers como un arraylist de tipo entero
        // Con new ArrayList<>() creamos un nuevo arraylist vacio

        // Metodos de ArrayList
        // size() ... tamaño de la lista
        System.out.println(variableNumbers.size()); // --> 0

        // add() ... añade un elemento a la lista
        variableNumbers.add(5); // --> añade el 5 a variableNumbers
        variableNumbers.add(10); // --> añade el 5 a variableNumbers
        System.out.println(variableNumbers); // --> [5, 10]
        // ahora: variableNumbers = [5, 10]

        // get() ... accede al elemento en el indice dado
        System.out.println(variableNumbers.get(1)); // --> 10

        // set() ... modifica el elemento de un indice dado
        variableNumbers.set(1, 100); // --> reemplaza el 10 por el 100
        // ahora: variableNumbers = [5, 100]

        // remove() ... elimina el elemento del indice dado
        variableNumbers.remove(1); // --> elimina el elemento 100
        // ahora: variableNumbers = [5]

        // contains() ... verifica si el paramatro dado esta incluido en la lista
        System.out.println(variableNumbers.contains(5)); // --> true



        // set
    }
}
