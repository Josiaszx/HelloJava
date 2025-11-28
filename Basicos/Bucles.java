package Basicos;

public class Bucles {
    public static void main(String[] args) {
        // bucle for
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1);
        }

        // for each
        int[] nums = {1, 2 ,3, 4, 5};
        for (int i: nums) {
            System.out.println(i * 2);
        }

        // while
        int x = 0;
        while (x == 0) {
            x++;
        }

        // do-while
        do {
            System.out.println(x);
            x++;
        } while (x == 0);

        // Control de ciclo
        // - continue = salta a la siguiente iteracion
        // - break = termina el ciclo

    }
}
