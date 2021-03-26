package br.com.sauer.pitagoras;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precoProduto, valorPago, troco;

        System.out.print("Informe o preço do produto: ");
        precoProduto = sc.nextDouble();

        System.out.print("Informe o valor que o cliente pagou: ");
        valorPago = sc.nextDouble();

        troco = valorPago - precoProduto;

        System.out.println("O troco a ser entregue para o cliente é: " + troco);

    }

}
