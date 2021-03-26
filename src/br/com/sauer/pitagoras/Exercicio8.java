package br.com.sauer.pitagoras;

import java.util.Scanner;

public class Exercicio8 {

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

        switch(codigo){
            case 1:
                System.out.println("Você escolheu parafuso");
                break;

            case 2:
                System.out.println("Você escolheu porca");
                break;

            case 3:
                System.out.println("Você escolheu prego");
                break;

            case 4:
                System.out.println("Você escolheu diversos.");
                break;
        }

        sc.close();

    }

}
