package unidade01.atividade03;

import java.util.Scanner;

/***
 * Faça um algoritmo onde deverá ser informado nome,
 * nota de trabalho e nota da prova.
 * O algoritmo deverá calcular a média e se a média for maior que 7(sete),
 * imprimir o nome do aluno e a situação aprovado,
 * senão reprovado
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = scanner.nextDouble();

        System.out.print("Digite a nota da prova: ");
        double notaProva = scanner.nextDouble();

        double media = (notaTrabalho + notaProva) / 2.0;

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média: " + media);

        if (media > 7.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}
