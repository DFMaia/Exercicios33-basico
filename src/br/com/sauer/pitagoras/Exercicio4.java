package br.com.sauer.pitagoras;

public class Exercicio4 {

    public static void main(String[] args) {

        int [] numeros = {75, 25, 100, 0, 50};
        int menorNumero = 1000;

        for(int i = 0; i < numeros.length; i++){
            if(menorNumero > numeros[i]){
                menorNumero = numeros[i];
            }
        }

        System.out.println(menorNumero);

    }

}
