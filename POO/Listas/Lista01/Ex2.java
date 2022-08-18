package Listas.Lista01;

import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
        int comprimento;
        int largura;
        int  altura;
        int volume;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o comprimento");
        comprimento = Integer.parseInt(teclado.nextLine());

        System.out.println("Digite a altura");
        altura = Integer.parseInt(teclado.nextLine());

        System.out.println("Digite a largura");
        largura = Integer.parseInt(teclado.nextLine());
        
        volume = comprimento * largura * altura;

        System.out.println("O volume é: " + volume);

        teclado.close();
    }    
}
