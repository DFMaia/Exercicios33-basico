package br.com.sauer.pitagoras;

public class Exercicio18 {

    public static void main(String[] args) {

        int numeros [] ={32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};

        int contadorDeNumerosPares = 0;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] %2 == 0){
                contadorDeNumerosPares += 1;
            }
        }

        int outrosNumeros [] = new int[contadorDeNumerosPares];
        int numeroAuxiliar = 0;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] %2==0){
              outrosNumeros[numeroAuxiliar] = numeros[i];
              numeroAuxiliar++;
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
