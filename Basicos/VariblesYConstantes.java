package Basicos;

public class VariblesYConstantes {
    public static void main(String[] args) {


        // enteros, todos son primitivos
        int firstInt = 1;
        // con int deifinimos un entero de 32 bits (-2,147,483,648 hasta 2,147,483,647)
        byte lowNum = 21;
        // con byte definimos un numero de 8 bits (-128 hasta 127)
        short midNum = 1000;
        // con short difinimos un numero de hasta 16 bits (-32,768 hasta 32,767)
        long bigNum = 10000000;
        // con long definimos un numero de hasta 64 bits


        // decimales, todos primtivos
        double decimalNumber = 0.99;
        // double define un decimal de 64 bits
        float anotherDecimalNumber = 0.65f;
        // float define decimales de hasta de 6 o 7 digitos (se agrega una f al final del valor)


        //boleanos, primitivos
        boolean trueValue = true;
        boolean falseValue = false;


        // caracteres, primitivos
        char letter = 'a';
        // char define un caracter ACSII (se debe definiir el valor entre comillas simples '')


        // strings, no primitivo
        String firstString = "Mi primer string en Java";
        // la palabra reservada String crea una variable del tipo string
        System.out.println(firstString);
        // imprimiendo la cadena


        // constantes
        final String FIRSTCONSTANT = "constante";
        // con final definimos una constante
        // como buena practica se definen las constantes todo en mayusculas


    }
}