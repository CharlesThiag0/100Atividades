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

    }

}
