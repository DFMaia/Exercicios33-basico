package br.com.sauer.pitagoras;

public class Exercicio20 {

    public static void main(String[] args) {

        int numeros [] ={32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int outroNumero[] = {0};

        int mediaAritimética = 0;

        for(int i = 0; i < numeros.length; i++){
            mediaAritimética += numeros[i];
        }

        double calculo = Math.round(mediaAritimética / numeros.length);

        System.out.println("Sequência de números do array:");
        for(int i = 0; i <  numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nA média da sequência do array é: " + calculo);

    }

}
