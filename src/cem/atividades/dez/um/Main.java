package cem.atividades.dez.um;

public class Main {

    public static void main(String[] args) {

        Soma operacoes = new Soma(10, 12);
        operacoes.calculoOperacaoBasica();
        operacoes.mediaAritmedica();
        operacoes.mediaGeometrica(20.0, 12.0, 11.0);
        operacoes.imc(1.84, 70);
        operacoes.perimetroCirculo(11.0);
        operacoes.areaDoCirculo(10);
        operacoes.valorDeDelta(3, 4 , 10);
        operacoes.calculoAreaPerimetro(12.0,8.0);
        operacoes.perimetroDeTriangulo(12, 14, 10, 16);

        operacoes.velocidadeMediaETempo(70.0, 2);
        operacoes.energiaCinetica(800, 20);
        operacoes.forcaSobreUmObjeto(100, 2);
        operacoes.distanciaPlanoCarteziano(2, 4,  3, 1);
        operacoes.volumeEsfera(3);
        operacoes.separarPalavra("Charles");
        operacoes.substituirLetras("charles thiago dos santos oliveira");
        operacoes.palindromo("kayak");
        operacoes.anagrama("celia", "alice");
        operacoes.primeiroNome("Charles thiago dos Santos Oliveira");

    }

}
