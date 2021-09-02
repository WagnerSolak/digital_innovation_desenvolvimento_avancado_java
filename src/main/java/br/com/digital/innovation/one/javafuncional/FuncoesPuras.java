package br.com.digital.innovation.one.javafuncional;

import java.util.function.BiPredicate;

public class FuncoesPuras {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> vaerificaSeEMaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(vaerificaSeEMaior.test(13, 12));
        //toda vez que passar msm parâmetro ele trará mesmo valor
        System.out.println(vaerificaSeEMaior.test(13, 12));

    }
}
