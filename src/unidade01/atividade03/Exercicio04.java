package unidade01.atividade03;

import java.util.Scanner;

/**
 * Exercicio 04: Leia o valor do salário atual de um funcionário e
 * calcule o reajuste salarial conforme percentual abaixo:
 * - Salário < 500, reajuste de 15%
 * - Salário >= 500 e <= 1000, reajuste de 10%
 * - Salário > 1000, reajuste de 5%
 * Apresente o valor do novo salário.
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: ");
        double salario = scanner.nextDouble();

        double novoSalario;

        if (salario < 500) {
            novoSalario = salario + (salario * 0.15);
        } else if (salario >= 500 && salario <= 1000) {
            novoSalario = salario + (salario * 0.10);
        } else {
            novoSalario = salario + (salario * 0.05);
        }

        System.out.println("Novo salário: " + novoSalario);
    }
}

