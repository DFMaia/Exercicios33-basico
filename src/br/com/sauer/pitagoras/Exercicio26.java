package br.com.sauer.pitagoras;

public class Exercicio26 {

    public static void main(String[] args) {

        int numeros [] ={32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};

        int contadorDeIndicesValidos = 0;

        for(int i = 0; i < numeros.length; i++){
            if(i + 1 >= numeros.length){
                break;
            } else if(numeros[i] < numeros[i + 1]){
                contadorDeIndicesValidos++;
            }
        }

        int outrosNumeros [] = new int[contadorDeIndicesValidos];
        int contadorAuxiliar = 0;

        for(int i = 0; i < numeros.length; i++){
            if(i + 1 >= numeros.length){
                break;
            }else if(numeros[i] < numeros[i + 1]){
                outrosNumeros[contadorAuxiliar] = i;
                contadorAuxiliar++;
            }
        }

        System.out.println("Sequência de números do array:");
        for(int i = 0; i <  numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nÍndices que tem elementos menores que o seguinte: ");
        for(int i = 0; i < outrosNumeros.length; i++){
            System.out.print(outrosNumeros[i] + " ");
        }

    }

}
