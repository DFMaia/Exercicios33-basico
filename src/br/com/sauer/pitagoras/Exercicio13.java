package br.com.sauer.pitagoras;

public class Exercicio13 {

    public static void main(String[] args) {

        int [] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int)Math.round(Math.random() * 100);
        }

        System.out.println("Segue o valor de ordem de entrada");
        for(int i = 0; i < numeros.length; i++ ){
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nSegue o valor inverso da ordem de entrada");
        for(int i =numeros.length -1; i >= 0 ; i--){
            System.out.print(numeros[i] + " ");
        }

    }

}
