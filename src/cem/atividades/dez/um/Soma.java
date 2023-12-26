package cem.atividades.dez.um;

public class Soma {

    /*
    Escreva um programa que solicite ao usuário dois números e exiba a soma, subtração,
     multiplicação e divisão entre eles.
     */

    private int num01;

    private int num02;

    public Soma(int num01, int num02) {
        this.num01 = num01;
        this.num02 = num02;
    }

    public void calculoOperacaoBasica() {
        System.out.println("Resultados");
        System.out.printf("Soma = %d\n", (num01 + num02));
        System.out.printf("Subtração = %d\n",(num01 - num02));
        System.out.printf("Multiplicação = %d\n", (num01 * num02));
        System.out.printf("Divisão = %d\n", (num01 / num02));
    }
}
