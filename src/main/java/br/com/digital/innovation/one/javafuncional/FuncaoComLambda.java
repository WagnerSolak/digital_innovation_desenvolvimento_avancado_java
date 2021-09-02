package br.com.digital.innovation.one.javafuncional;

public class FuncaoComLambda {

    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNaString =
                valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("Solak"));

    }
}

@FunctionalInterface
interface Funcao {
    String gerar (String valor);
}
