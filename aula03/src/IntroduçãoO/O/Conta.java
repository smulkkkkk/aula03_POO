package IntroduçãoO.O;

public class Conta {
    String titular;
    double saldo;

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.titular = "Maria";
        conta1.saldo = 1000;

        Conta conta2 = new Conta();
        conta2.titular = "João";
        conta2.saldo = 500;

        System.out.println("Conta 1 - Titular: " + conta1.titular + ", Saldo: " + conta1.saldo);
        System.out.println("Conta 2 - Titular: " + conta2.titular + ", Saldo: " + conta2.saldo);
    }
}
