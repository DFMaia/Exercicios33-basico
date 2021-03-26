package br.com.sauer.pitagoras;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        int codigo;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite um código de 1 - 4: ");
            codigo = sc.nextInt();

            if(codigo <= 0 || codigo > 4){
                System.out.println("\nO número INTEIRO não pode ser menor ou igual a zero e não pode ser maior que 4.");
            }

        }while(codigo < 1 || codigo > 4);

        if(codigo == 1){
            System.out.println("Você escolheu parafuso");
        } else if (codigo == 2){
            System.out.println("Você escolheu porca");
        }else if( codigo == 3){
            System.out.println("Você escolheu prego");
        } else if(codigo == 4){
            System.out.println("Você escolheu diversos.");
        }

        sc.close();

    }

}
