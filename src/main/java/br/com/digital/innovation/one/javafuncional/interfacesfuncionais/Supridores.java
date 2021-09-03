package br.com.digital.innovation.one.javafuncional.interfacesfuncionais;

import java.util.function.Supplier;

public class Supridores {

    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessoa = Pessoa::new;
        // Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        System.out.println(instanciaPessoa.get());
    }
}

class Pessoa{
    private String nome;
    private Integer idade;


    public Pessoa(){
    nome = "Solak";
    idade = 29;
    }

    @Override
    public String toString() {
        return String.format("nome: %s, idade: %d",nome,idade);
    }
}

