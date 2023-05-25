package Exercicios002;

import java.util.Scanner;

public class SalarioPorHora {
    public static void main (String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora de trabalho: ");
        double salarioHora = entradaUsuario.nextDouble();
        System.out.println("Digite quantas horas você trabalha por mês: ");
        double horasTrabalhadas = entradaUsuario.nextDouble();

        double salarioMensal = salarioHora * horasTrabalhadas;
        System.out.println("Seu salário mensal é de R$ " + salarioMensal);

    }
}
