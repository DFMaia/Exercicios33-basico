package br.com.sauer.pitagoras;

public class Exercicio16 {

    public static void main(String[] args) {

        int numeros [] ={32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};

        int outrosNumeros [] = new int[1];

        int menorNumero = 1000000000;

        int posicao = -1;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < menorNumero){
                menorNumero = numeros[i];
                posicao = i;
            }
        }

        System.out.println("O menor número é " + menorNumero + " na posição " + posicao);

    }

}