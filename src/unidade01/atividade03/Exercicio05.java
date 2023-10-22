package unidade01.atividade03;

import java.util.Scanner;

/**
 * Exercicio 05: Um endocrinologista deseja controlar a saúde de seus pacientes, e para isso, se utiliza o índice de massa corporal (IMC).
 * Sabendo que o IMC é calculado através da fórmula IMC=peso/altura^2, crie um algoritmo que apresente o nome do paciente e a faixa de risco, baseando na seguinte tabela:
 * - IMC Abaixo dos 20: Abaixo do peso
 * - IMC A partir dos 20 até 25: Normal
 * - IMC A partir dos 25 até 35: Excesso de peso
 * - IMC A partir dos 35 até 50: Obesidade
 * - IMC A partir dos 50: Obesidade Mórbida
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o peso do paciente (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura do paciente (em metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String faixaDeRisco;
        if (imc < 20) {
            faixaDeRisco = "Abaixo do peso";
        } else if (imc >= 20 && imc <= 25) {
            faixaDeRisco = "Normal";
        } else if (imc > 25 && imc <= 35) {
            faixaDeRisco = "Excesso de peso";
        } else if (imc > 35 && imc <= 50) {
            faixaDeRisco = "Obesidade";
        } else {
            faixaDeRisco = "Obesidade Mórbida";
        }

        System.out.println("Nome do paciente: " + nome);
        System.out.println("IMC: " + imc);
        System.out.println("Faixa de Risco: " + faixaDeRisco);
    }
}