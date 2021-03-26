package br.com.sauer.pitagoras;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorDoQuilo, quilosConsumidos, valorASerPago;

        System.out.print("Informe o valor do quilo: ");
        valorDoQuilo = sc.nextDouble();

        System.out.print("Informe a quantidade de quilos consumidas");
        quilosConsumidos = sc.nextDouble();

        valorASerPago = valorDoQuilo * quilosConsumidos;
        System.out.println("O valor do quilo é: R$" + valorDoQuilo + "." +
                "Você consumiu " + quilosConsumidos + " quilos.\n" +
                "O valor a ser pago será de: " + valorASerPago);

    }

}
