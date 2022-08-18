package Listas.Lista01;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int consumo = 12;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a velocidade média: ");
        int vm = Integer.parseInt(teclado.nextLine());


        System.out.println("Digite o tempo: ");
        int tempo = Integer.parseInt(teclado.nextLine());

        int d = tempo * vm, litros = d/consumo;

        System.out.println("Velocidade média é: " + vm + "\nTempo que levou: " + tempo +
                            "\nDistância: " + d + "\nQuantidade de litros utilizada: " + litros);
        // System.out.printf("Velocidde média é %i", vm);
        teclado.close();
    }
}
