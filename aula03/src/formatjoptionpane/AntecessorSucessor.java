package formatjoptionpane;

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        System.out.println("Antecessor: " + (numero - 1));
        System.out.println("Número: " + numero);
        System.out.println("Sucessor: " + (numero + 1));

        sc.close();
    }
}
