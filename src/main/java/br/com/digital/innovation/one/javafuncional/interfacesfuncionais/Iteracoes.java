package br.com.digital.innovation.one.javafuncional.interfacesfuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

    public static void main(String[] args) {
        String[] nomes = {"Solak", "Wagner", "Felipe", "Estudante", "Java"};
        Integer[] numeros = {1,2,3,4,5};
        //imprimirNomesFiltrados(nomes);
        //imprimirTodosNomes(nomes);
        imprimirODobroDeCadaItemDaLista(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Gerente de Projeto");
        profissoes.add("Gerente do Financeiro");
        profissoes.add("Teste");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);
    }

    private static void imprimirNomesFiltrados(String... nomes) {

        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++){
            if (nomes[i].equals("Solak")){
                nomesParaImprimir+=" "+nomes[i];
            }
        }

        System.out.println("Nomes gerados pelo for: "+nomesParaImprimir);

        String nomeParaImprimirDaStream =  Stream.of(nomes)
                        .filter(nome -> nome.equals("Solak"))
                                .collect(Collectors.joining()); //String

        System.out.println("Nomes gerados pela stream: "+nomeParaImprimirDaStream);
    }

    public static void imprimirTodosNomes(String[] nomes) {
        for (String nome : nomes) {
            System.out.println("Imprimindo pelo for "+nome);
        }
        Stream.of(nomes).forEach(nome ->
                System.out.println("Impresso pelo forEach: "+nome));

    }
    public static void imprimirODobroDeCadaItemDaLista(Integer... numeros){
        for (Integer numero : numeros) {
            System.out.println(numero*2);
        }
        Stream.of(numeros).map(numero -> numero *2)
                .forEach(System.out::println);
    }
}
