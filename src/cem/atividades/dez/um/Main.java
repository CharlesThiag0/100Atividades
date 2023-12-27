package cem.atividades.dez.um;

public class Main {

    public static void main(String[] args) {

        Soma operacoes = new Soma(10, 12);
        operacoes.calculoOperacaoBasica();
        operacoes.mediaAritmedica();
        operacoes.mediaGeometrica(20.0, 12.0, 11.0);
        operacoes.imc(1.84, 70);
    }

}
