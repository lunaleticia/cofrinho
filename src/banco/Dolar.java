package banco;

public class Dolar extends Moeda {
    public Dolar(double saldo, double cotacao) {
        super(saldo, cotacao, 2);
    }

    @Override
    public void info() {
        System.out.println("Moeda em dólar: $" + saldo);
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
