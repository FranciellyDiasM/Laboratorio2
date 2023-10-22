package references;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um texto");
        String entradaDeTexto = scanner.nextLine();
        System.out.println(entradaDeTexto);


        System.out.println("Entre com um inteiro");
        int entradaDeInteiro = scanner.nextInt();
        System.out.println(entradaDeInteiro);
    }
}
