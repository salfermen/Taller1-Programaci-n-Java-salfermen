import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar la fecha de nacimiento al usuario
        System.out.print("Ingrese su año de nacimiento: ");
        int birthyear = scanner.nextInt();
        System.out.print("Ingrese el mes de nacimiento (1-12): ");
        int birthmonth = scanner.nextInt();
        System.out.print("Ingrese el día de nacimiento: ");
        int birthday= scanner.nextInt();

        // Crear el objeto LocalDate para la fecha de nacimiento
        LocalDate date = LocalDate.of(birthyear, birthmonth, birthday);

        // Obtener la fecha actual
        LocalDate A_date = LocalDate.now();

        // Calcular la edad
        int edad = A_date.minusYears(birthyear).getYear();

        // Verificar si el cumpleaños ya pasó este año
        if (birthmonth> A_date.getMonthValue() ||
                (birthmonth == A_date.getMonthValue() && birthday > A_date.getDayOfMonth())) {
            edad--;
        }

        // Mostrar la edad
        System.out.println("Su edad es: " + edad + " años");


    }
}
