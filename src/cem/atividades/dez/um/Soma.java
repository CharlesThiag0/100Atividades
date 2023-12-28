package cem.atividades.dez.um;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

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
    public void perimetroDeTriangulo(double a, double b, double c, double altura) {
        System.out.printf("Perimetro do triagulo: %.2f\nÁrea do triangulo: %.2f\n",
                (a + b + c), ((b * altura) / 2));
    }

    // 11
    public void velocidadeMediaETempo(double distancia, double tempo) {
        System.out.printf("Velocidade média: %.2f\n",
                (distancia / tempo));
    }

    // 12
    public void energiaCinetica(double massa, double velocidade) {
        velocidade *= velocidade;
        System.out.printf("Energia cinetica total de: %.2fJ\n", (massa * velocidade / 2));
    }

    // 13
    public void forcaSobreUmObjeto(double forca, double distancia) {
        System.out.printf("Força de %.2f e distancia %.2f é: %.2f\n", forca, distancia, (forca * distancia));
    }

    // 14
    public void distanciaPlanoCarteziano(double xA, double xB, double yA, double yB) {
        System.out.printf("Distância do plano carteziano: %.3f\n",
                Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2)));
    }

    //15
    public void volumeEsfera(double raioEsfera) {
        System.out.printf("Volume da esfera é: %.2f\n", (Math.pow(raioEsfera, 3) * 4 * PI) / 3);
    }

    // 17
    public void separarPalavra(String palavra) {
        System.out.printf("Separando a palavra %s\n", palavra);
        for (int i = 0; i < palavra.length(); i++) {
            System.out.print(palavra.charAt(i) + "-");
        }
        System.out.println();
    }

    // 18
    public void substituirLetras(String frase) {
        System.out.printf("%s\n", frase.replace("a", "e"));
    }

    // 20
    public void palindromo(String original) {
        StringBuilder inversa = new StringBuilder(original);
        inversa.reverse();
        if (inversa.toString().equals(original)) {
            System.out.println("Palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }

    // 21
    public void anagrama(String primeiraPalavra, String segundaPalavra) {
        // verificar se tem o mesmo tamanho
        if(primeiraPalavra.length() != segundaPalavra.length()) {
            System.out.println("Não é um anagrama");
           return;
        }
        // definir tamanho do Array
        int[] frequencia01 = new int[primeiraPalavra.length()];
        int[] frequencia02 = new int[segundaPalavra.length()];
        // for para armazenar os caracteres
        for(int i = 0; i < primeiraPalavra.length(); i++){
            frequencia01[i] = primeiraPalavra.charAt(i);
            frequencia02[i] = segundaPalavra.charAt(i);
        }
        // metudo  sort para organizar em ordem alfabetica
        Arrays.sort(frequencia01);
        Arrays.sort(frequencia02);
        // equals para verificar se o conteudo são iguais
        if(Arrays.equals(frequencia01, frequencia02)) {
            System.out.println("Anagrama");
        } else {
            System.out.println("Não anagrama");
        }
    }

    // 22
    public void primeiroNome(String nomeCompleto) {
        System.out.println(nomeCompleto.substring(0, nomeCompleto.indexOf(" ")));
    }

    // 23
    /*
    Faça um programa que receba uma frase e exiba a quantidade de espaços em branco presentes na mesma.
     */

}