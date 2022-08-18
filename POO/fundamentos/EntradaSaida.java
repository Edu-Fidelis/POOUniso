package fundamentos;

import javax.swing.JOptionPane;

public class EntradaSaida {
    public static void main(String[] args) {

        //2ª Forma de entrada e saída
        String nome;
        int idade;

        JOptionPane.showMessageDialog(null, "Exemplo de mensagem");

        nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
        JOptionPane.showMessageDialog(null, "Seja bem-vindo " + nome);

        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a sua idade"));
        JOptionPane.showMessageDialog(null, "A idade do(a) " + nome + " é " + idade, "Demonstração", JOptionPane.INFORMATION_MESSAGE);
    }
}
