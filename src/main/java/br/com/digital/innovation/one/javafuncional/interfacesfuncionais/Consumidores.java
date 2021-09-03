package br.com.digital.innovation.one.javafuncional.interfacesfuncionais;

import java.util.function.Consumer;

public class Consumidores {

    public static void main(String[] args) {
        // Method Reference ::
        Consumer<String>imprimirUmaFrase = System.out::println;
        //                                  parâmetro
        //Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("A frase da Function Interface do Java");

    }
}
