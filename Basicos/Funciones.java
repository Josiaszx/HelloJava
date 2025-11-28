package Basicos;

public class Funciones {

    public static void main(String[] args) {
        function();

        int num = addFunction(5, 10);
        // ahora: num = 15

        greet("Juan"); // llama a funcion 1
        greet("Diego", "Lucas"); // llama a funcion 2
    }


    // funcion
    public static void function() {
        System.out.println("this is a function");
    }
    // public: se puede acceder desde cualquier parte del codigo
    // static: la funcion es de tipo static
    // void: la funcion no retorna nada


    // función con retorno + parametros
    public static int addFunction(int x, int y) {
        return x + y;
    }


    // sobrecarga de funciones
    // - sobrecarga se refiere a cuando dos funciones con el mismo nombre ejecutan logica diferente según los paramatros dados
    public static void greet(String name) { // funcion 1
        System.out.println("Hello " + name);
    }

    public static void greet(String name1, String name2) { // funcion 2
        System.out.println("Hello " + name1 + " and " + name2);
    }
    // en este caso se ejecutará una de las funciones dependiendo de los parametros dados

}
