import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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
        // - lista desordenada
        // - no se pueden repetir elementos
        // - no tiene acceso por indices
        HashSet<Integer> nums = new HashSet<>();

        // add() ... agregar elementos
        nums.add(1);
        nums.add(2);
        nums.add(3);
        // ahora: nums = (1, 2, 3);

        // size() ... tamaño del set
        System.out.println(nums.size()); // --> 3

        // contains() ... verifica si un elemento esta incluido
        System.out.println(nums.contains(3)); // --> true

        // remove() ... elimina el elemento dado
        nums.remove(3);
        // ahora: nums = (1, 2);



        // map
        // - lista que guarda elementos de tipo clave-valor
        // - estructura desordenada
        // - no admite repetidos
        HashMap<String, Integer> ages = new HashMap<>();
        // El primer valor String define a todos las claves como cadenas
        // el segundo valor Integer define a todos los valores como enteros

        // put() ... agregar pares al map
        ages.put("Diego", 17);
        ages.put("Juan", 18);
        ages.put("Sergio", 20);

        // size() ... tamaño del map (cantidad de pares)
        System.out.println(ages.size()); // --> 3

        // get() ... acceder al valor de una clave dada
        // ! si la clave no existe devuelve null !
        int diegoEdad = ages.get("Diego");
        // ahora: diegoEdad = 17

        // containsKey() ... verifica si la clave dada esta incluida en el map
        System.out.println(ages.containsKey("Sergio")); // --> true

        // containsValue() ... verifica si un valor pertenece al map
        System.out.println(ages.containsValue(19)); // --> false

        // remove() ... elimina un par
        ages.remove("Juan");
        // ahora: ages = {Diego = 17, Sergio = 20}
    }
}
