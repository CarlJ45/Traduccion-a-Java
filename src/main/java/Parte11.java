import java.util.Scanner;

/**
 * @author Carlos Jahir Morocho Pogo
 */
public class Parte11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero;
        double mayor = 0;
        double menor = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Ingrese el numero " + i + ": ");
            numero = entrada.nextDouble();

            if (i == 1) {
                mayor = numero;
                menor = numero;
            } else {

                if (numero > mayor) {
                    mayor = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }

            }
        }

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);

    }
}