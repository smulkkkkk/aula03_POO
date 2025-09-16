package Scanner;

import java.util.Scanner;

public class LeituraScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();

        System.out.print("Digite um número inteiro: ");
        int inteiro = sc.nextInt();

        System.out.print("Digite um número real: ");
        double real = sc.nextDouble();

        System.out.println("\nResultado:");
        System.out.println("Texto: " + texto);
        System.out.println("Número inteiro: " + inteiro);
        System.out.println("Número real: " + real);

        sc.close();
    }
}
