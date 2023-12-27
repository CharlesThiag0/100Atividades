package cem.atividades.dez.um;

public class Soma {

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

    public void mediaAritmedica() {
        int total = num01 + num02;
        System.out.printf("Média aritmédica de %d com %d é: %d\n", num01, num02, (total / 2));
    }

    public void mediaGeometrica(double numA, double numB, double numC) {
        System.out.printf("Média geometrica é %.2f\n", Math.cbrt(numA * numB * numC));
    }

    public void imc (double altura, double peso){
        altura *= altura;
        System.out.printf("IMC: %.2f\n", (peso / altura ));
    }



}
