package Exercicios002;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota: ");
        double nota1 = entradaUsuario.nextDouble();
        System.out.println("Digite a sua segunda nota: ");
        double nota2 = entradaUsuario.nextDouble();
        System.out.println("Digite a sua terceira nota: ");
        double nota3 = entradaUsuario.nextDouble();
        System.out.println("Digite a sua quarta nota: ");
        double nota4 = entradaUsuario.nextDouble();

        double mediaGeral = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A sua média aritmética é " + mediaGeral);

    }
}
