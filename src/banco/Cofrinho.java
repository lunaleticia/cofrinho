package banco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cofrinho {
    private List<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    public void removerMoeda(double valor, int tipo) {
        Iterator<Moeda> iterator = moedas.iterator();
        boolean moedaRemovida = false;
        while (iterator.hasNext()) {
            Moeda moeda = iterator.next();
            if (moeda.saldo == valor && moeda.tipo == tipo) {
                iterator.remove();
                System.out.println("Moeda removida!");
                moedaRemovida = true;
                break; // Remove apenas uma moeda com o saldo especificado
            }
        }

        if (!moedaRemovida) {
            System.out.println("Moeda não encontrada.");
        }
    }

    public boolean listarMoedas() {
        if (moedas.size() <= 0) {
            System.out.println("Sem moedas no cofrinho!");
            return false;
        }

        System.out.println("-------------------------------");
        System.out.println("===[ Moedas ]===");
        for (Moeda moeda : moedas) {
            moeda.info();
        }

        return true;
    }

    public void mostrarSaldoTotalEmReais() {
        double total = 0.0;
        for (Moeda moeda : moedas) {
            total += moeda.converter();
        }

        double totalEmReais = total;
        System.out.println("Saldo total em reais: R$" + totalEmReais);
    }
}
