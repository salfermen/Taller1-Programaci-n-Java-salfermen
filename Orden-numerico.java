import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido, ingrese el primer número: ");
        int N1 = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int N2 = sc.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int N3 = sc.nextInt();

        System.out.println("Ingrese el cuarto número: ");
        int N4 = sc.nextInt();

        // Ordenar los números usando un array
        int[] N = {N1, N2, N3, N4};
        java.util.Arrays.sort(N);

        System.out.println("Números ordenados de menor a mayor:");
        for (int num : N) {
            System.out.println(num);
        }
    }
}
