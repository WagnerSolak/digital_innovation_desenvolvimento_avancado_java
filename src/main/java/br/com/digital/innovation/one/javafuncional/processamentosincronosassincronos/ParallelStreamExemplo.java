package br.com.digital.innovation.one.javafuncional.processamentosincronosassincronos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExemplo {
    // para trabalhar com alto volume de objetos
    // nao exsiste ordem para execução, cuidar na aplicação de Parallel Stream
    //melhora tempo de execução em Servidores
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        IntStream.range(1,10000).parallel().forEach(num -> fatorial(num)); //Serial
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução :: "+(fim-inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1,10000).parallel().forEach(num -> fatorial(num)); //Parallel
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução :: "+(fim-inicio));

        List<String> nomes = Arrays.asList("Solak", "Martins", "Wagner");
        nomes.stream().parallel().forEach(System.out::println);
    }



public static long fatorial(long num){
    long fat = 1;
    for (int i=0; i <= num; i++){
        fat*=i;
    }
    return fat;

}
}
