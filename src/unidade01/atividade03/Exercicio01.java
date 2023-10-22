package unidade01.atividade03;

import java.util.Scanner;

/**
 * Faça um algoritmo onde deverá ser informado um número.
 * O algoritmo deverá exibir se o número
 * é positivo, negativo ou nulo
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é nulo.");
        }
    }
}
