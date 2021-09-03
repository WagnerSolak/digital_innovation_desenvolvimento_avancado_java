package br.com.digital.innovation.one.javafuncional.interfacesfuncionais;

import java.util.function.Predicate;

public class Predicados {

    public static void main(String[] args) {
        //Predicate<String> estaVazio = valor -> valor.isEmpty();
        //Como ele trabalha com mesmo obj que recebo ele aceita Method Reference
        Predicate<String> estaVazio = String::isEmpty;

        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Solak"));

        // Predicate recebem um parametro, e retornam um boolean
    }
}
