package br.com.digital.innovation.one.javafuncional.processamentosincronosassincronos;

public class ThreadExemplo {

    public static void main(String[] args) {
      Thread thread = new Thread(new BarraDeCarregamento2());//instaciou e passou como parametro a implementacao da interface
      Thread thread2 = new Thread(new BarraDeCarregamento3());
      thread.start();
      thread2.start();
      //barraDeCarregamento2.start(); // metodo que pega a thread e executa algo
        System.out.println("Nome da thread: " +thread.getName());
        System.out.println("Nome da thread: " +thread2.getName());
    }
}

// primeira estratégia
class BarraDeCarregamento2 implements Runnable {
    @Override
    public void run(){
        try {
            Thread.sleep(3000);
            System.out.println("rodeiBarraDeCarregamento2: ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class BarraDeCarregamento3 implements Runnable {
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
            System.out.println("rodeiBarraDeCarregamento3: ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
