public class Strings {
    public static void main(String[] args) {
        // strings
        String name = "Josias";
        String lastName = "Maidana";

        // operaciones básicas
        // Concatenacion
        System.out.println(name + " " + lastName); // --> Josias Maidana

        // longitud
        System.out.println(name.length()); // --> 6

        // chartAt() ... devuelve el caracter en la posicion dada
        System.out.println(name.charAt(0)); // --> J

        // substring() ... devuelve una subcadena con los indices dados
        System.out.println(lastName.substring(3)); // --> dana
        System.out.println(lastName.substring(1, 5)); // --> aida (No incluye al ultimo indice)

        // toUpperCase() y toLowerCase() ... convierte una cadena a mayusculas y minusculas
        System.out.println(name.toUpperCase()); // -->  JOSIAS
        System.out.println(name.toLowerCase()); // --> josias

        // contains() ... comprueaba si una cadena dada esta contenida en otra
        System.out.println(name.contains("sias")); // --> true

        // equals() ... compara dos cadenas
        System.out.println(name.equals("Josias")); // --> true
        // tambien se puede usar equalsIgnoreCase() para comparar sin considerar minusculas ni mayusculas
        // se recomienda usar este metodo por sobre la comparacion ==

        // trim() .. elimina los espacios adelante y atras de la cadena
        System.out.println("  Hi  ".trim()); // --> Hi

        // replace() ... reemplaza un caracter o cadena por otro dado
        System.out.println(name.replace("sias", "nas")); // --> Jonas

        

    }
}
