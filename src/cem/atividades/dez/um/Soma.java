package cem.atividades.dez.um;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

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
    public double imc(double altura, double peso) {
        altura *= altura;
        return peso / altura;
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
        if (primeiraPalavra.length() != segundaPalavra.length()) {
            System.out.println("Não é um anagrama");
            return;
        }
        // definir tamanho do Array
        int[] frequencia01 = new int[primeiraPalavra.length()];
        int[] frequencia02 = new int[segundaPalavra.length()];
        // for para armazenar os caracteres
        for (int i = 0; i < primeiraPalavra.length(); i++) {
            frequencia01[i] = primeiraPalavra.charAt(i);
            frequencia02[i] = segundaPalavra.charAt(i);
        }
        // metudo  sort para organizar em ordem alfabetica
        Arrays.sort(frequencia01);
        Arrays.sort(frequencia02);
        // equals para verificar se o conteudo são iguais
        if (Arrays.equals(frequencia01, frequencia02)) {
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
    public void contagemEspaco(String frase) {
        int quantidade = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                quantidade++;
            }
        }
        System.out.printf("Quantidade de espaços: %d\n", quantidade);
    }

    // 24
    public void cotarVogais(String frase) {
        Set<Character> vogais = new HashSet();
        vogais.add('a');
        vogais.add('e');
        vogais.add('i');
        vogais.add('o');
        vogais.add('u');

        String str = frase.toLowerCase();

        int cont = 0;
        for (char teste : str.toCharArray()) {
            if (vogais.contains(teste)) {
                cont++;
            }
        }
        System.out.printf("Contagem de vogais: %d\n", cont);
    }

    // 25
    public void ultimoSobreNome(String nomeCompleto) {
        int ultimoSobrenome = nomeCompleto.lastIndexOf(" ");
        char letra[] = nomeCompleto.toCharArray();
        for (int i = ultimoSobrenome + 1; i < nomeCompleto.length(); i++) {
            System.out.print(letra[i]);
        }
    }

    //28
    public void maiorEntreTres(double numA, double numB, double numC) {
        if (numA > numB && numA > numC) {
            System.out.println(numA);
        } else if (numB > numC) {
            System.out.println(numB);
        } else {
            System.out.println(numC);
        }
    }

    // 29
    public void imparPar(int num) {
        if (num % 2 == 0) {
            System.out.printf("O numero %d é par\n", num);
        } else {
            System.out.printf("O numero %d é ímpar\n", num);
        }
    }

    // 36
    public void maiorIdade(String usuario01, int idadeUsuario01, String usuario02, int idadeUsuario02,
                           String usuario03, int idadeUsuario03) {
        Map<String, Integer> usuarios = new HashMap<>();
        usuarios.put(usuario01, idadeUsuario01);
        usuarios.put(usuario02, idadeUsuario02);
        usuarios.put(usuario03, idadeUsuario03);

        usuarios.forEach((s, integer) -> {
            if (integer >= 18) {
                System.out.printf("É maior de idade: %s\n", s);
            } else {
                System.out.printf("Não é maior de idade: %s\n", s);
            }
        });
    }

    // 37
    public void triangulo(double ladoA, double ladoB, double ladoC) {
        ladoA += ladoB;
        if (ladoA > ladoC) {
            System.out.println("É triângulo");
        } else {
            System.out.println("Não é um triângulo");
        }
    }

    // 38
    public void poderaVotar(int anoDeNascimento, int mes, int dia) {
        LocalDate dataDoUsuario = LocalDate.of(anoDeNascimento, mes, dia);
        LocalDate dataDoSistema = LocalDate.now();

        if (dataDoSistema.getYear() - dataDoUsuario.getYear() >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }

    }

    // 39
    public void votacao(int idade) {
        if (idade >= 18 || idade >= 69) {
            System.out.println("Seu voto é obrigatorio!");
        } else if (idade == 16 || idade == 17 || idade >= 70) {
            System.out.println("Seu voto é opcional");
        } else {
            System.out.println("Não esta apta a votar");
        }
    }

    // 41
    public void diaUtil(String dia) {
        String diaMaiusculo = dia.toUpperCase();
        Set<String> diasUteis = new HashSet<>();
        diasUteis.add("SEGUNDA");
        diasUteis.add("TERCA");
        diasUteis.add("QUARTA");
        diasUteis.add("QUINTA");
        diasUteis.add("SEXTA");

        if (diasUteis.contains(diaMaiusculo)) {
            System.out.println("Dia util");
        } else if (diaMaiusculo.equals("SABADO") || diaMaiusculo.equals("DOMINGO")) {
            System.out.println("Fim de semana");
        } else {
            System.out.println("Data inválida");
        }

    }

    // 42
    public void indiceImc(double altura, double peso) {
        double valorImc = imc(altura, peso);

        if (valorImc == 17 || valorImc < 18.49) {
            System.out.println("Baixo peso");

        } else if (valorImc < 24.99) {
            System.out.println("Peso normal");

        } else if (valorImc < 29.99) {
            System.out.println("Sobrepeso");

        } else if (valorImc < 34.99) {
            System.out.println("Obesidade grau I");

        } else if (valorImc < 39.99) {
            System.out.println("Obesidade grau II");

        }

    }

    // 49
    /*
    Escreva um programa que exiba os números pares de 1 a 50 e os
    números ímpares de 51 a 100 utilizando um laço de repetição.
     */
    public void paresImpares() {
        int num = 1;
        System.out.println("Pares: ");
        for(int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nImpares: ");
        for (int j = 51; j <= 100; j ++){
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }

    }


}