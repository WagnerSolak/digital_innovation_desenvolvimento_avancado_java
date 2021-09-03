package br.com.digital.innovation.one.javafuncional.interfacesfuncionais;

import static br.com.digital.innovation.one.javafuncional.interfacesfuncionais.FuncaoAltaOrdem.executarOperacao;

public class FuncaoAltaOrdem {

    public static void main(String[] args) {
        //comportamento ao executar
        Calculo SOMA = (a,b) -> a+b;
        Calculo SUBTRACAO = (a,b) -> a-b;
        Calculo DIVISAO = (a,b) -> a/b;
        Calculo MULTI = (a,b) -> a*b;

        System.out.println(executarOperacao(SOMA, 1, 3));
        System.out.println(executarOperacao(SUBTRACAO, 4, 3));
        System.out.println(executarOperacao(DIVISAO, 4, 2));
        System.out.println(executarOperacao(MULTI, 7, 3));
    }

    //funcao de alta ordem (pq método é uma funcao)
    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calculo(a,b);
    }
    // o método de cima seria isso:
    /*public int soma(int a,b){
        return a + b;
    }*/
}

@FunctionalInterface
interface Calculo {
    public  int calculo(int a,int b);
}

//Recebe por parâmetro outra função;  -> mais comum no Java
//Ou que ela retorna uma funcao que já retorna outra;