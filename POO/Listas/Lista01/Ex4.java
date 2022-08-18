package Listas.Lista01;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = Integer.parseInt(teclado.nextLine());

        System.out.println("Digite a altura: ");
        int altura = Integer.parseInt(teclado.nextLine());

        int area = base * altura, perimetro = 2 * base + 2* altura;

        System.out.println("A área é: " + area + "\nO perímetro é " + perimetro);
        teclado.close();
    }
}
