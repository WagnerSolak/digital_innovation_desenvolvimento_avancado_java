package br.com.digital.innovation.one.javafuncional.paradigmafuncional;

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

