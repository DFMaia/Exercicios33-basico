package br.com.sauer.pitagoras;

public class Exercicio6 {

    public static void main(String[] args) {

        double lado1 = 3.0;
        double lado2 = 4.0;
        double lado3 = 3.0;

        if((lado1 == 0) || (lado2 == 0) || (lado3 == 0)){
            System.out.println("Um triângulo não pode ter qualquer lado igual a zero");
        } else if ((lado1 + lado2 < lado3) || (lado2 + lado3 < lado1)){
            System.out.println("A soma de dois lados não pode ser maior que um lado do triângulo");
        } else {
            if((lado1 == lado2) && (lado3 == lado1)){
                System.out.println("Triângulo equilátero");
            } else if(((lado1 == lado2) && (lado3 != lado1)) || (lado1 != lado2) && (lado3 == lado1)) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        }

    }

}
