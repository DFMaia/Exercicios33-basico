package br.com.sauer.pitagoras;

public class Exercicio13_1 {

    public static void main(String[] args) {

        int numeros [] ={32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int numeroslenght = numeros.length;

        int numerosDois [] = new int[numeroslenght];

        for(int i = 0; i <numeros.length; i++){
            numerosDois[i] = numeros[i];
        }

        System.out.println("A sequeência da primeira lista: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nA sequeência da segunda lista: ");
        for(int i = 0; i < numerosDois.length; i++){
            System.out.print(numerosDois[i] + " ");
        }

    }

}
