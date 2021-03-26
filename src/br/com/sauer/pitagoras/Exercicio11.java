package br.com.sauer.pitagoras;

import java.util.ArrayList;
import java.util.List;

public class Exercicio11 {

    public static void main(String[] args) {

        List<Integer> cinquentaNumeros = new ArrayList();
        int valorTotal = 0;
        double mediaLista;

        for(int i = 1; i <= 50; i++){
            cinquentaNumeros.add((int) Math.round(Math.random() * 100));
        }

        for(int i = 0; i < cinquentaNumeros.size(); i++ ){
            valorTotal += cinquentaNumeros.get(i);
        }

        mediaLista = valorTotal / cinquentaNumeros.size();

        System.out.println("Segue a sequência de números: ");
        cinquentaNumeros.stream().forEach(System.out::println);
        System.out.println();
        System.out.println("A média dos números dessa sequência é de: " + mediaLista);

    }
}
