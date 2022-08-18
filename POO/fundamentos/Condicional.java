package fundamentos;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int numero;

        System.out.println("Digite o seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite um número: ");
        numero = teclado.nextInt();

        if (nome.toUpperCase().contains("E")) {
            System.out.println("O nome tem a letra 'E' ");
        }

        if (numero == 10) {
            System.out.println("O número é igual a 10");
        } else {
            System.out.println("O número é diferente de 10");
        }

        if (numero == 10) {
            System.out.println("10");
        } 
        else if (numero == 15) {
            System.out.println("15");
        }
        else if (numero > 20) {
            System.out.println("Maior que 20");
        } 
        else
        {
            System.out.println("Não definido");            
        }

        switch (numero) {
            case 10:
                System.out.println("Igual a 10");
                break;
            case 15:
            System.out.println("Igual a 15");
            default:
            System.out.println("Não definido");
                break;
        }
        System.out.printf("O nome digitado foi %s e o número foi %d", nome, numero);

        teclado.close();
    }
}
