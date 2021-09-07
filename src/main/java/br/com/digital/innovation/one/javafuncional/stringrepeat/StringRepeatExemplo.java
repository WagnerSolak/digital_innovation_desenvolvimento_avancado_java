package br.com.digital.innovation.one.javafuncional.stringrepeat;

public class StringRepeatExemplo {

    public static void main(String[] args) {
        /* Para escrever 10 vezes o nome
        String nome = "Wagner";

        String aux = "";
        for (int i = 0; i < 10; i++){
            aux+=nome;
        }
        System.out.println(aux);*/

        //Com Java 11 posso usar:
        String nome = "Wagner";
        System.out.println(nome.repeat(10));
    }
}
