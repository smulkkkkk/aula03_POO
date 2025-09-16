package formatjoptionpane;

public class Fatoriais {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.println("O Fatorial de " + i + " é: " + fatorial);
        }
    }
}
