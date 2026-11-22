import java.util.Scanner;

/**
 * @author Carlos Jahir Morocho Pogo
 */
public class Parte9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero entero: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= 12; i++) {

            System.out.println(numero + " x " + i + " = " + (numero * i));

        }

    }
}