package banco;

public class Real extends Moeda {
    public Real(double saldo, double cotacao) {
        super(saldo, cotacao, 1);
    }

    @Override
    public void info() {
        System.out.println("Moeda em real: R$" + saldo);
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
