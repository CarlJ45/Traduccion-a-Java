import java.util.Scanner;

/**
 * @author Carlos Jahir Morocho Pogo
 */
public class Parte7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int cantidad = 0;
        int suma = 0;

        System.out.print("Ingrese un numero positivo: ");
        numero = entrada.nextInt();

        while (numero >= 0) {

            if (numero > 0) {
                cantidad++;
                suma = suma + numero;
            }

            System.out.print("Ingrese otro numero: ");
            numero = entrada.nextInt();
        }

        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);

    }
}