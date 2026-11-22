import java.util.Scanner;

/**
 * @author Carlos Jahir Morocho Pogo
 */
public class Parte4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota;

        System.out.print("Ingrese la nota del estudiante: ");
        nota = entrada.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

    }
}