package formatjoptionpane;


import javax.swing.JOptionpane;

public class DadosPessoais {
    public static void main(String[] args) {
        String nome = JOptionpane.showInputDialog("Digite seu nome:");
        String telefone = JOptionpane.showInputDialog("Digite seu telefone:");
        String email = JOptionpane.showInputDialog("Digite seu email:");
        double salario = Double.parseDouble(JOptionpane.showInputDialog("Digite seu salário:"));

        double salarioComBonus = salario * 1.10;
        String salarioFormatado = String.format("%.2f", salarioComBonus);

        JOptionpane.showMessageDialog(null,
            "Dados cadastrados:" +
            "\nNome: " + nome +
            "\nTelefone: " + telefone +
            "\nEmail: " + email +
            "\nSalário com 10% de acréscimo: R$ " + salarioFormatado
        );
    }
}

