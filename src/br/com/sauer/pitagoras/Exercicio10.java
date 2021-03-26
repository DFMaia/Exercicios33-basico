package br.com.sauer.pitagoras;

import java.util.ArrayList;
import java.util.List;

public class Exercicio10 {

    public static void main(String[] args) {

        List<Integer> cinquentaNumeros = new ArrayList();
        int valorTotal = 0;
        double mediaLista;

        int contador = 1;
        int contadorDois = 0;

        while(contador <= 50){
            cinquentaNumeros.add((int) Math.round(Math.random() * 100));
            contador++;
        }

        while(contadorDois < cinquentaNumeros.size()){
            valorTotal += cinquentaNumeros.get(contadorDois);
            contadorDois++;
        }

        mediaLista = valorTotal / cinquentaNumeros.size();

        System.out.println("Segue a sequência de números: ");
        cinquentaNumeros.stream().forEach(System.out::println);
        System.out.println();
        System.out.println("A média dos números dessa sequência é de: " + mediaLista);

    }

}
