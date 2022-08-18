package Listas.Lista01;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em °C: ");
        int c = Integer.parseInt(teclado.nextLine()), f = (9*c+160)/5 ;
        System.out.println("A temperatura em Fahrenheit é: " + f);
        teclado.close();
    }
}
