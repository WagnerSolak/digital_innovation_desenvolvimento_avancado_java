package br.com.digital.innovation.one.javafuncional;

public class FatorialTailCaill {

    public static void main(String[] args) {
        System.out.println(fatorialA(5));
    }
    public static double fatorialA(double valor){
        return fatorialComTailCall(valor, 1);
    }
    // double numero => variavel auxiliar que guarda o valor do fatorial
    public static double fatorialComTailCall(double valor, double numero){
        if( valor == 0) {
            return numero;
        }
        return fatorialComTailCall(valor-1, numero*valor);
    }
    // recursividade padrão: começa do final para o início
    // 5 * 4 * 3 * 2 * 1
    // 5 <-4 <-3 <-2 <-1

    // recursividade tail call:
    // 5 *  4 = 20
    // 20 * 3
    // 60
    // 60 *  4
    // 120 * 1
    // 120
    // Desta forma não precisa começar do inicio da pilha e ir "voltando" ele





}
