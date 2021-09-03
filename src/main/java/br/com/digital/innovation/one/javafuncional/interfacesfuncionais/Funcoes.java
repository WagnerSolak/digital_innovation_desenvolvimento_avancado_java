package br.com.digital.innovation.one.javafuncional.interfacesfuncionais;

import java.util.function.Function;

public class Funcoes {

    public static void main(String[] args) {
        Function<String, String> retornaNomeAoContrario =
                texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiroECalcularDobro =
                string -> Integer.valueOf(string) * 2;

        System.out.println(retornaNomeAoContrario.apply("Solak"));
        System.out.println(converterStringParaInteiroECalcularDobro.apply("20"));

    }
}
