package br.com.digital.innovation.one.javafuncional.paradigmafuncional;

import java.util.function.Function;

public class CodigoImperativo {

    public static void main(String[] args) {
        //declarando um comprtamento que pode ou nao ser executado
        Function<Integer, Object> buscarUsuarioComLambda =
                // busca meu usuario
                idUsuario -> new Object();
        System.out.println();

        // buscando de forma imperativa
        System.out.println(buscarUsuario(15));

    }

    public static Object buscarUsuario(int idUsuario){
        // retorna usuário
        return new Object();
    }
}
