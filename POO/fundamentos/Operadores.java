package fundamentos;

public class Operadores {
    public static void main(String[] args) {
        //Exemplo de operadores relacionais
        System.out.println(2 >= 2);

        //Exemplo de operadores de atribuição
        int x = 0;
        //somar valor nessa variável
        x = x + 2;
        x += 2;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);

        //binário
        x = 3;

        String texto;

        //terciário
        texto = x == 3 ? "Valor igual a 3" : "Valor não é 3";
        System.out.println(texto);
    }
}
