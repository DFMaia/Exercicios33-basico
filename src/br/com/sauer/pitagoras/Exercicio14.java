package br.com.sauer.pitagoras;

public class Exercicio14 {

    public static void main(String[] args) {

        int numeros [] ={32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};

        int numerosDois [] = new int[numeros.length];

        int tamanho = numerosDois.length - 1;

        for(int i = 0; i < numeros.length; i++){
            numerosDois[tamanho] = numeros[i];
            tamanho --;
        }

        for(int i = 0; i < numerosDois.length; i ++){
            System.out.print(numerosDois[i] + " ");
        }

    }

}
