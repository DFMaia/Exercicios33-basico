package br.com.sauer.pitagoras;

public class Exercicio25 {

    public static void main(String[] args) {

        int numeros [] ={32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};

        int quantidadeIndicesMenoresCinquenta = 0;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < 50){
                quantidadeIndicesMenoresCinquenta++;
            }
        }

        int [] outrosNumeros = new int[quantidadeIndicesMenoresCinquenta];
        int contadorAuxiliar = 0;

        for(int i = numeros.length -1; i >= 0; i--){
            if(numeros[i] < 50){
                outrosNumeros[contadorAuxiliar] = i;
                contadorAuxiliar++;
            }
        }

        System.out.println("Sequência de números do array:");
        for(int i = 0; i <  numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nSequencia reversa do segundo array: ");
        for(int i = 0; i < outrosNumeros.length; i++){
            System.out.print(outrosNumeros[i] + " ");
        }

    }
}
