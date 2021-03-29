package br.com.sauer.pitagoras;

public class Exercicio27 {

    public static void main(String[] args) {

        int numeros [] ={32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};

        int contadorDeLength = 0;

        for(int  i =1; i < numeros.length; i++){
            if(i >= numeros.length - 1){
                break;
            } else if(((numeros[i - 1] + numeros[i + 1]) / 2 == numeros[i])){
                contadorDeLength++;
            }
        }

        int outrosNumeros [] = new int[contadorDeLength];
        int numeroAuxiliar = 0;

        for(int  i =1; i < numeros.length; i++){
            if(i >= numeros.length - 1){
                break;
            } else if(((numeros[i - 1] + numeros[i + 1]) / 2 == numeros[i])){
                outrosNumeros[numeroAuxiliar] = i;
                numeroAuxiliar++;
            }
        }

        System.out.println("Sequência de números: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nPosições que se adequam a regra do exercício.");
        for(int i = 0; i < outrosNumeros.length; i++){
            System.out.print(outrosNumeros[i] + " ");
        }

    }

}
