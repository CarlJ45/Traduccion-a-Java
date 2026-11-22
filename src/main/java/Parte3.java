import java.util.Scanner;

/**
 * @author Carlos Jahir Morocho Pogo
 */
public class Parte3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad;

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        }

    }
}