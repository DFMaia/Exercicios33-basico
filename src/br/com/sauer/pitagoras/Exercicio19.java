package br.com.sauer.pitagoras;

public class Exercicio19 {

    public static void main(String[] args) {

        int numeros [] ={32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};

        int quantidadeDeIndicesValoresAcimaCinquenta = 0;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > 50){
                quantidadeDeIndicesValoresAcimaCinquenta++;
            }
        }

        int outrosNumeros [] = new int[quantidadeDeIndicesValoresAcimaCinquenta];
        int contador = 0;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > 50){
                outrosNumeros[contador] = i;
                contador++;
            }
        }

        System.out.println("Sequência de números do vetor: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nSequência de números pares em outro array:");
        for(int i = 0; i < outrosNumeros.length; i++){
            System.out.print(outrosNumeros[i] + " ");
        }

    }

}
