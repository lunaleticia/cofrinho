package banco;

public class Euro extends Moeda {
    public Euro(double saldo, double cotacao) {
        super(saldo, cotacao, 3);
    }

    @Override
    public void info() {
        System.out.println("Moeda em euro: €" + saldo);
    }

    @Override
    public double converter() {
        return saldo * cotacao;
    }

    @Override
    public void adicionar(double valor) {
        saldo += valor;
    }

    @Override
    public void remover(double valor) {
        saldo -= valor;
    }
}
