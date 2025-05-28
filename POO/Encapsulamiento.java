package POO;

import java.sql.Array;

public class Encapsulamiento {
    // Encapsulamieto (Modificadores de acceso)

    // Modificadores de acceso
    // - public: permite el acceso a la clase desde todo el programa
    // - prívate: no permite el  acceso desde ninguna parte fuera de la clase
    // - protected: permite el acceso desde la clase y subclases dentro del mismo paquete
    // - default: permite el acceso desde el mismo paquete

    // getters: permiten el acceso a una variable de manera controlada
    // setters: permiten la modificacion controlada de variables

    public static void main(String[] args) {
        User user1 = new User("josias@gmail.com", "Josias", 1945, 19);

        System.out.println(user1.email); // --> josias@gmail.com
        System.out.println(user1.name); // --> Josias
        // System.out.println(user1.id); error
        // ^ no se puede acceder porque id es private
        // para acceder a id usamos el metodo getId()
        System.out.println(user1.getId()); // --> 1945
        System.out.println(user1.getAge()); // --> 19

        user1.setAge(24); // se modifica la edad con el metodo setAge()
        System.out.println(user1.getAge()); // --> 24

    }
}
