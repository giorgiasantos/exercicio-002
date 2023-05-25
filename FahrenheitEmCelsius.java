package Exercicios002;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FahrenheitEmCelsius {
    public static void main(String[] args){
        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Informe o valor da temperatura em Fahrenheits: ");
        double temperaturaF = entradaUsuario.nextDouble();

        double temperaturaC = (temperaturaF - 32) / 1.8;
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.0");
        System.out.println("A temperatura é de " + decimalFormat.format(temperaturaC) + " °C");
    }
}
