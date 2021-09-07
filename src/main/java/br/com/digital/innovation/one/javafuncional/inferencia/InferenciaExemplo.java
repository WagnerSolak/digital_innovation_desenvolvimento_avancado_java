package br.com.digital.innovation.one.javafuncional.inferencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class InferenciaExemplo {

    public static void main(String[] args)  {
        printarNomeCompeto("Solak", "Martins");
        printarSoma(5,5,5);
    }

    public static void connectAndPrintURLJavaOracle() throws IOException{
        // igual dar GET no endpoint pegando conteúdo
        //URL url = new URL("https://docs.oracle.com/javase/10/language/");
        var url = new URL("https://docs.oracle.com/javase/10/language/");

        //URLConnection urlConnection = url.openConnection();
        var urlConnection = url.openConnection();


        //getInputStream() pega todos os bytes e "joga" no inputStream
        //BufferedReader -> transforma em linha, melhor para leitura
        /*BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));*/
        // lines -> obtive as linhas

        var bufferedReader =
                new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        System.out.println(bufferedReader.lines().collect(Collectors.joining())
                .replaceAll(">", ">\n"));

    }

    public static void printarNomeCompeto(String nome, String sobrenome){
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nome);
    }
    public static void printarSoma(int... numeros){
       int soma;
       if (numeros.length > 0){
           soma = 0;
           for (var numero: numeros){
               soma+=numero;
           }
            System.out.println("A soma é: "+soma);
        }
    }

    // Consegue utilizar:
    // var locais e inicializadas
    // var suporte do enhaced for(forEach)
    // var suporte do for iterativo
    // variavel try with resource


    // Não consegue utilizar:
    // var não pode ser utilizado em nível de classe
    // var não pode ser utilizado como parâmetro
    // var não pode ser utilizada em variáveis locais não inicializadas
}
