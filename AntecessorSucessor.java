package Exercicios002;

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args){
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroUsuario = entradaUsuario.nextInt();

        int numeroAnterior = numeroUsuario - 1;
        int numeroSucessor = numeroUsuario + 1;
        System.out.println("O número anterior de " + numeroUsuario + " é " + numeroAnterior + " e o número sucessor é " + numeroSucessor);
    }
}
