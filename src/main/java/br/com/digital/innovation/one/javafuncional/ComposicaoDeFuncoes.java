package br.com.digital.innovation.one.javafuncional;

import java.util.Arrays;

public class ComposicaoDeFuncoes {

    public static void main(String[] args) {
        //paradigma funcional
        int[] valores = {1,2,3,4};
        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0) // se resto igual a zero, pegue nr
                .map(numero -> numero * 2)         // e multiplica 2
                .forEach(numero -> System.out.println(numero));

        //paradigma imperativo
        for (int i = 0; i < valores.length; i++){
            int valor = 0;
            if(valores[i] % 2 == 0){
                valor = valores[i] * 2;
                if(valor != 0){
                    System.out.println(valor);
                }
            }
        }
    }
}
