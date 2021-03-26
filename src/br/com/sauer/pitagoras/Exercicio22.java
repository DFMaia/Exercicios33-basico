package br.com.sauer.pitagoras;

public class Exercicio22 {

    public static void main(String[] args) {

        int numeros [] ={32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};

        int quantidadeDeNumerosMenoresCinquenta = 0;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < 50){
                quantidadeDeNumerosMenoresCinquenta++;
            }
        }

        int outrosNumeros [] = new int[quantidadeDeNumerosMenoresCinquenta];
        int contadorAuxiliar = 0;
        int maiorNumeroAbaixoCinquenta = 0;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < 50){
                outrosNumeros[contadorAuxiliar] = numeros[i];
                contadorAuxiliar++;
            }
        }

        for(int i = 0; i < outrosNumeros.length; i++){
            if(outrosNumeros[i] > maiorNumeroAbaixoCinquenta){
                maiorNumeroAbaixoCinquenta = outrosNumeros[i];
            }
        }

        System.out.println("Sequência de números do array:");
        for(int i = 0; i <  numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nO maior número abaixo de 50 é: " + maiorNumeroAbaixoCinquenta);

    }

}
