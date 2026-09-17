import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0.0;
        int opcao;

        do {
            System.out.println("\n===== CAIXA ELETRÔNICO =====");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Realizar Depósito");
            System.out.println("3 - Realizar Saque");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double deposito = scanner.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("Depósito realizado com sucesso!%nNovo saldo: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Valor inválido");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor do saque: R$ ");
                    double saque = scanner.nextDouble();

                    if (saque <= saldo && saque > 0) {
                        saldo -= saque;
                        System.out.printf("Saque realizado com sucesso!%nNovo saldo: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;

                case 4:
                    System.out.println("Sessão encerrada. Obrigado por utilizar o caixa eletrônico!");
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        } while (opcao != 4);

        scanner.close();
    }
}
