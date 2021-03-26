package br.com.sauer.pitagoras;

public class Exercicio17 {

    public static void main(String[] args) {

        int numeros [] ={32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};

        int tamanhoApropriado = 0;

        /**
         * Aqui eu estou dividino o tamnho do vetor para colocar no outro vetor, uma vez que só quero passar
         * os vatores pares para a outra lista.
         */

        if(numeros.length %2 == 0){
            tamanhoApropriado = numeros.length / 2;
        } else if(numeros.length %2 == 1) {
            tamanhoApropriado = (numeros.length / 2) + 1;
        }

        System.out.println("Tamanho apropriado: " + tamanhoApropriado);

        int outrosNumeros [] = new int [tamanhoApropriado];
        int numeroAuxiliar = 0;

        for(int i = 0; i < numeros.length; i++){
            if( i %2 == 0){
                outrosNumeros[numeroAuxiliar] = numeros[i];
                numeroAuxiliar++;
            }
        }

        //Imrpressão
        for(int i = 0; i < outrosNumeros.length; i++){
            System.out.print( outrosNumeros[i] + " ");
        }



    }

}
