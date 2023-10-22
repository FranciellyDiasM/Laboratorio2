package unidade01.atividade03;

import java.util.Scanner;

/***
 * Ler 2 números inteiros do teclado (A e B),
 * verificar e imprimir qual deles é o maior,
 * ou a mensagem “A=B” caso sejam iguais.
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int numeroA = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int numeroB = scanner.nextInt();

        if (numeroA > numeroB) {
            System.out.println("A é maior do que B");
        } else if (numeroA < numeroB) {
            System.out.println("B é maior do que A");
        } else {
            System.out.println("A é igual a B");
        }
    }
}
