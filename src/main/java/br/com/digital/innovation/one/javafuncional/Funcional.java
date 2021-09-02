package br.com.digital.innovation.one.javafuncional;

import java.util.function.UnaryOperator;

public class Funcional {

    public static void main(String[] args) {
        UnaryOperator<Integer> calcularValorVezesTrinta
                = valor -> valor*3; // aqui só passa a instrução, não executa 9paradigma funcional)
        int valor = 10;
        System.out.println("O resultado é :: "+ calcularValorVezesTrinta);

    }
}
