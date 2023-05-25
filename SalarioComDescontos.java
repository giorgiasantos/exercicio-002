package Exercicios002;

import java.util.Scanner;

public class SalarioComDescontos {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora de trabalho: ");
        double salarioHora = entradaUsuario.nextDouble();
        System.out.println("Digite quantas horas você trabalha por mês: ");
        double horasTrabalhadas = entradaUsuario.nextDouble();

        double salarioBruto= salarioHora * horasTrabalhadas;
        System.out.println("Seu salário bruto é de R$ " + salarioBruto);

        double valorImposto = (11 * salarioBruto) / 100;
        System.out.println("Você pagou R$ " + valorImposto + " de Imposto de Renda.");

        double valorInss = (8 * salarioBruto) / 100;
        System.out.println("Você pagou R$ " + valorInss + " de INSS.");

        double valorSindicato = (5 * salarioBruto) / 100;
        System.out.println("Você pagou R$ " + valorSindicato+ " ao Sindicato.");

        double salarioLiquido = salarioBruto - valorImposto - valorInss - valorSindicato;
        System.out.println("Seu salário líquido é R$ " + salarioLiquido);
    }
}
