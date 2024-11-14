package banco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        System.out.println("Bem-vindo ao cofrinho virtual do janjão \uD83D\uDE01\uD83D\uDE01\uD83D\uDE01!");

        while (true) {

            System.out.println("-------------------------------");
            System.out.println("              Menu             ");
            System.out.println("-------------------------------");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total em reais");
            System.out.println("5 - Encerrar programa");
            System.out.print("Qual é a sua escolha: ");


            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    // Adicionar moeda
                    System.out.println("-------------------------------");
                    System.out.println("1 - Real");
                    System.out.println("2 - Dolar");
                    System.out.println("3 - Euro");
                    System.out.print("Qual é a sua escolha: ");

                    int moedaEscolhida = scanner.nextInt();

                    System.out.println("Digite o saldo da moeda:");
                    double saldo = scanner.nextDouble();

                    Moeda moeda = null;

                    switch (moedaEscolhida) {
                        case 1:
                            moeda = new Real(saldo, 1);
                            break;
                        case 2:
                            moeda = new Dolar(saldo, 5.25);
                            break;
                        case 3:
                            moeda = new Euro(saldo, 6);
                            break;
                        default:
                            System.out.println("Moeda inválida!");
                            break;
                    }
                    if (moeda != null) {
                        cofrinho.adicionarMoeda(moeda);
                        System.out.println("Moeda adicionada com sucesso!");
                    }

                    break;
                case 2:
                    if (!cofrinho.listarMoedas()) {
                        break;
                    }

                    // Remover moeda
                    cofrinho.listarMoedas();
                    System.out.println("-------------------------------");
                    System.out.println("1 - Real");
                    System.out.println("2 - Dolar");
                    System.out.println("3 - Euro");
                    System.out.print("Qual é a sua escolha: ");

                    int tipo = scanner.nextInt();

                    System.out.print("Digite o valor da moeda para remoção: ");

                    double valorEscolhido = scanner.nextDouble();

                    cofrinho.removerMoeda(valorEscolhido, tipo);
                    break;
                case 3:
                    Moeda real = new Real(0, 0);
                    cofrinho.listarMoedas();

                    break;
                case 4:
                    // Calcular total em reais
                    cofrinho.mostrarSaldoTotalEmReais();
                    break;
                case 5:
                    System.out.println("Encerrando programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
