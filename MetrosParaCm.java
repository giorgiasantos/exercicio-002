package Exercicios002;

import java.util.Scanner;

public class MetrosParaCm {
    public static void main (String[] args){
        double umMetro = 100;
        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Digite seu valor em metros: ");
        double metrosUsuario = entradaUsuario.nextDouble();

        double metrosEmCentimetros = metrosUsuario * umMetro;
        System.out.println(metrosUsuario + " metros é o equivalente a " + metrosEmCentimetros + " centímetros.");
    }
}
