package formatjoptionpane;

import java.util.Scanner;

public class Pessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[4];
        double[] pesos = new double[4];
        double[] alturas = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Peso: ");
            pesos[i] = sc.nextDouble();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        int indiceMaiorPeso = 0;
        int indiceMaiorAltura = 0;
        for (int i = 1; i < 4; i++) {
            if (pesos[i] > pesos[indiceMaiorPeso]) {
                indiceMaiorPeso = i;
            }
            if (alturas[i] > alturas[indiceMaiorAltura]) {
                indiceMaiorAltura = i;
            }
        }

        double mediaPeso = (pesos[0] + pesos[1] + pesos[2] + pesos[3]) / 4;
        double mediaAltura = (alturas[0] + alturas[1] + alturas[2] + alturas[3]) / 4;

        System.out.println("Pessoa com maior peso: " + nomes[indiceMaiorPeso]);
        System.out.println("Pessoa com maior altura: " + nomes[indiceMaiorAltura]);
        System.out.println("Média de peso: " + mediaPeso);
        System.out.println("Média de altura: " + mediaAltura);

        sc.close();
    }
}
