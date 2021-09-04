package br.com.digital.innovation.one.javafuncional.processamentosincronosassincronos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FutureExemplo {
    // executerService como se fosse o método run()
    private static final ExecutorService pessoasParaExecutarAtividade =
            Executors.newFixedThreadPool(3);

    public void main(String[] args) {
        Casa casa = new Casa(new Quarto());
        List<? extends Future<?>> futuros =

        new CopyOnWriteArrayList<>(casa.obterAfazeresDaCasa().stream()
                .map(atividade -> pessoasParaExecutarAtividade.submit(() -> {
                    try {
                        atividade.realizar();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }))
                .collect(Collectors.toList()));

        while (!futuros.stream().allMatch(Future::isDone)) {
            int numeroDeAtividadesNaoFinalizadas = 0;
            for (Future<?> futuro : futuros) {

                if (futuro.isDone()) {
                    try {
                        System.out.println("Parabéns você terminou de " + futuro.get());
                        futuros.remove(futuro);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                } else {
                    numeroDeAtividadesNaoFinalizadas++;
                }
                System.out.println("Numero de atividades não finalzidas :: "
                        + numeroDeAtividadesNaoFinalizadas);
            }
            pessoasParaExecutarAtividade.shutdown();
        }
    }

    class Casa {
        private List<Comodo> comodos;

        Casa(Comodo... comodos) {
            this.comodos = Arrays.asList(comodos);
        }

        List<Atividade> obterAfazeresDaCasa() {
            return this.comodos.stream().map(Comodo::obterAFazeresDoComodo)
                    .reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
                        pivo.addAll(atividades);
                        return pivo;
                    });
        }
    }

    interface Atividade {
        void realizar() throws InterruptedException;
    }

    abstract class Comodo {
        abstract List<Atividade> obterAFazeresDoComodo();
    }

     class Quarto extends Comodo {
        @Override
        List<Atividade> obterAFazeresDoComodo() {

            return Arrays.asList(
                    this::getArrumarACama, // = avidade.add();
                    this::varrerOQuarto,
                    this::arrumarGuardaRoupa
            );
        }

        private void arrumarGuardaRoupa() throws InterruptedException {
            Thread.sleep(5000);
            System.out.println("arrumar o guarda roupa");
        }

        private void varrerOQuarto() throws InterruptedException {
            Thread.sleep(5000);
            System.out.println("arrumar o quarto");
        }

        private void getArrumarACama() throws InterruptedException {
            Thread.sleep(5000);
            System.out.println("arrumar a cama");
        }
    }
}