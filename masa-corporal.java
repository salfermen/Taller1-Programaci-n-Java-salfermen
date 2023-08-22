import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la estaura en metros: ");
        double M = sc.nextDouble();

        System.out.println("Ingrese su peso en kilogramos: ");
        double W = sc.nextDouble();

        System.out.println("Ingrese su edad: ");
        int E = sc.nextInt();


        double MC = W / (M * M);


        String risk = "";
        if (MC < 18.5) {
            risk = "Estimado USUARIO usted tiene bajo peso conforme a los datos ingresados ";
        } else if (MC < 25) {
            risk = "Estimado USUARIO usted tiene un peso normal conforme a los datos ingresados";
        } else if (MC < 30) {
            risk = "Estimado USUARIO usted tiene sobrepeso conforme a los datos ingresados";
        } else {
            risk = "Estimado USUARIO usted tiene obesidad conforme a los datos ingresados";
        }

        System.out.println("Su índice de masa corporal (IMC) es: " + MC);
        System.out.println("Su condición de riesgo es: " + risk);
    }
}
