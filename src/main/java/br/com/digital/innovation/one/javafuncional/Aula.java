package br.com.digital.innovation.one.javafuncional;

public class Aula {

    public static void main(String[] args) {
        /*int valor = 10; //instrucao
        int resultado = valor * 3; //instrucao
        System.out.println("O resultado é :: " +resultado); //instrucao*/

        //funcao lambda da interface funcional
        Funcao1 funcao1 = valor ->      {
                System.out.println(valor);
                System.out.println(valor);
        };
        funcao1.gerar("Solak");
        }


        //System.out.println(funcao1.gerar("Wagner Solak"));

}

            //interface funcional
            @FunctionalInterface // proteção
            interface Funcao1 {
              //String gerar(String valor);
                void gerar(String valor);
            }


