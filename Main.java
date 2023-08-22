import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al juego de tennis");
        System.out.println("Ingresa los juegos ganados por el equipo A");
        int A = sc.nextInt();
        System.out.println("Ingresa los juegos ganados por el equipo B");
        int B = sc.nextInt();
        int Gb = A + 2;
        int Ga = B + 2;
        if (A > 6 || B  > 6) {
            System.out.println("opcion invalida");
        } else if ((A==5) && (B ==5)) {
            System.out.println("Empate 5 a 5");
            //empate 5 a 5
        } else if ((A ==6) && (B ==6)){
            System.out.println("Empate 6 a 6");
            //empate 6 a 6
        }
        else if ((B >=6) && (B >=Gb)) {
            System.out.println("gano el equipo b");
            // Gano el b
        } else if ((A>=6) && (A>=Ga)) {
            System.out.println("Gano el Equipo A");
            // Gano el a
        } else if((A <= 6) && (B <= 6)&&(A>=0)&&(B>=0))  {
            System.out.println("el juego aun no termina");
            //EL juego no ha terminado
        } else if (A == 5) {
            // Código para la variable A igual a 5
        } else {
            System.out.println("opcion invalida");
        }
    }
}