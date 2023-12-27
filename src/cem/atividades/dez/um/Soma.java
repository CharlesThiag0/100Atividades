package cem.atividades.dez.um;

public class Soma {

    private int num01;

    private int num02;

    private double PI = 3.14;

    public Soma(int num01, int num02) {
        this.num01 = num01;
        this.num02 = num02;
    }

    // 1
    public void calculoOperacaoBasica() {
        System.out.println("Resultados");
        System.out.printf("Soma = %d\n", (num01 + num02));
        System.out.printf("Subtração = %d\n", (num01 - num02));
        System.out.printf("Multiplicação = %d\n", (num01 * num02));
        System.out.printf("Divisão = %d\n", (num01 / num02));
    }

    // 2
    public void mediaAritmedica() {
        int total = num01 + num02;
        System.out.printf("Média aritmédica de %d com %d é: %d\n", num01, num02, (total / 2));
    }

    // 4
    public void mediaGeometrica(double numA, double numB, double numC) {
        System.out.printf("Média geometrica é %.2f\n", Math.cbrt(numA * numB * numC));
    }

    // 5
    public void imc(double altura, double peso) {
        altura *= altura;
        System.out.printf("IMC: %.2f\n", (peso / altura));
    }

    //  6
    public void perimetroCirculo(double raio) {
        System.out.printf("Petimetro do circlo:  %.2f\n", (2 * PI * raio));
    }

    // 7
    public void areaDoCirculo(double raio) {
        System.out.printf("Area de do circulo: %.2f\n", PI * Math.pow(raio, 2));
    }

    // 8
    public void valorDeDelta(double a, double b, double c) {
        b *= b;
        double delta = b - 4 * a * c;
        if (delta > 0) {
            System.out.printf("Delta igual a: %.3f\n", delta);
        } else {
            System.out.printf("O valor %.3f é negativo indica que a equação não possui raízes reais\n",
                    delta);
        }
    }

    // 9
    public void calculoAreaPerimetro(double largura, double comprimento) {
        System.out.println("Retângulo");
        System.out.printf("Perimetro: %.2f\nÁrea: %.2f\n",
                (2 * (largura + comprimento)), largura * comprimento);
    }

    // 10
    public void perimetroDeTriangulo (double a, double b, double c, double altura) {
        System.out.printf("Perimetro do triagulo: %.2f\nÁrea do triangulo: %.2f\n",
                (a + b + c), ((b * altura) / 2));
    }
}