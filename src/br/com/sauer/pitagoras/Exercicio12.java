package br.com.sauer.pitagoras;

public class Exercicio12 {

    public static void main(String[] args) {

        int numeros [] = new int [50];
        int quantidadeDeItens = numeros.length;
        int somatoria = 0;

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int) Math.round(Math.random() * 100);
        }

        System.out.println("Sequência de números: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        for(int i = 0; i < numeros.length; i++){
            somatoria += numeros[i];
        }

        double calculoDeMedia = somatoria / quantidadeDeItens;
        System.out.println("\nA média é: " + calculoDeMedia);

        System.out.println("\nSequência de números menor que a média");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < calculoDeMedia){
                System.out.print(numeros[i] + " ");
            }
        }

    }

}
