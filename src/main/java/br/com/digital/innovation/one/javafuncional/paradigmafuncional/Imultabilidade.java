package br.com.digital.innovation.one.javafuncional.paradigmafuncional;

import java.util.function.UnaryOperator;

public class Imultabilidade {

    public static void main(String[] args) {
        int valor =20;
        UnaryOperator<Integer> retornarDobro = v -> v *2; // retornarDobro -> comportamento

        System.out.println(retornarDobro.apply(valor)); //retorna dobro do valor
        System.out.println(valor); // valor não sera alterado

        // Ele faz a operacao, mas nao altera o valor da variavel

    }
}
