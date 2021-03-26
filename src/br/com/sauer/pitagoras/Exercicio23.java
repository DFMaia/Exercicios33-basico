package br.com.sauer.pitagoras;

public class Exercicio23 {

    public static void main(String[] args) {

        int numeros [] ={32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int outroNumero [] = {0};

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] %2 == 1){
                outroNumero[0] = i;
                break;
            }
        }

        System.out.println("Sequência de números do array:");
        for(int i = 0; i <  numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nO índice que contem o primeiro elemento ímpar é o: " + outroNumero[0]);

    }
}
