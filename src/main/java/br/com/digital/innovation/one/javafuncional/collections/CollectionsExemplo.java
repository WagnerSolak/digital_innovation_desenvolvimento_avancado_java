package br.com.digital.innovation.one.javafuncional.collections;

import java.util.Arrays;
import java.util.List;

public class CollectionsExemplo {

    public static void main(String[] args) {
        //List<String> nomes = Arrays.asList("Wagner", "Felipe", "Martins");

        List<String> nomes = List.of("Wagner", "Felipe", "Martins");
        System.out.println(nomes);
    }
}
