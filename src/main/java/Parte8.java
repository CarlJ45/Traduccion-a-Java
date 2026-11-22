import java.util.Scanner;

/**
 * @author Carlos Jahir Morocho Pogo
 */
public class Parte8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String contrasena;

        System.out.print("Ingrese la contrasena: ");
        contrasena = entrada.nextLine();

        while (!contrasena.equals("java2026")) {

            System.out.println("Contrasena incorrecta.");
            System.out.print("Intente nuevamente: ");
            contrasena = entrada.nextLine();

        }

        System.out.println("Acceso concedido.");

    }
}