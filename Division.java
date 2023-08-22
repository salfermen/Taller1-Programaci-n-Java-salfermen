import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, por favor ingrese el primer número ");
        int N1 = sc.nextInt();

        System.out.println("Ingrese el segundo número ");
        int N2 = sc.nextInt();

        if (N1 % N2 == 0) {
            System.out.println("La division es exacta");
        } else {
            System.out.println("La division no es exacta");
        }
    }
}
