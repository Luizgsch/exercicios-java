import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Digite um número: ");

    int numero = input.nextInt();

        if (numero > 0) {

            System.out.println("NÃO NEGATIVO");

        }

        else {System.out.println("NEGATIVO");

        }
            input.close();
    }
}
