package POO;

public class User {
    // definimos algunas variables public y private para verificar su acceso
    String email;
    String name;
    private final int id;
    private int age;

    // definimos el constructor
    public User(String email, String name, int id, int age) {
        this.email = email;
        this.name = name;
        this.id = id;
        this.setAge(age);
    }

    // como id es una variable privada, no se podra acceder desde otra clase
    // definimos un getter para id
    public int getId() {
        return id;
    }

    // para modificar la edad definimos un setter
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("La edad no puede ser menor a 0");
        } else {
            this.age = age;
        }
    }

    // para acceder a age
    public int getAge() {
        return age;
    }


}
