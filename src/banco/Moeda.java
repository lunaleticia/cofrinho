package banco;

public abstract class Moeda {
    protected double saldo;
    protected double cotacao;
    protected int tipo;

    public Moeda(double saldo, double cotacao, int tipo) {
        this.saldo = saldo;
        this.cotacao = cotacao;
        this.tipo = tipo;
    }

    public abstract void info();

    public abstract double converter();

    public abstract void adicionar(double valor);

    public abstract void remover(double valor);
}
