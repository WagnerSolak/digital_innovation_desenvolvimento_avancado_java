package br.com.digital.innovation.one.javafuncional;

import ch.qos.logback.classic.pattern.PrefixCompositeConverter;

public class FuncaoComClasseAnonima {

    public static void main(String[] args) {
        Funcao colocarPrefixoNaString = new Funcao() {
            @Override
            public String gerar(String valor) {
                return "Sr. " +valor;
            }
        };
        System.out.println(colocarPrefixoNaString.gerar("Solak"));

    }
}

