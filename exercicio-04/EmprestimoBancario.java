import java.util.Scanner;

public class EmprestimoBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        double emprestimo = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print("Digite o valor do empréstimo: ");
            String entrada = scanner.nextLine();

            try {
                emprestimo = Double.parseDouble(entrada);
                if (emprestimo > 0) {
                    valido = true;
                } else {
                    System.out.println("Erro: o valor deve ser maior que zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um número válido (ex.: 3500.50).");
            }
        }

        int parcelas = 0;
        valido = false;

        while (!valido) {
            System.out.print("Em quantas parcelas deseja pagar (6 a 48)? ");
            String entrada = scanner.nextLine();

            try {
                parcelas = Integer.parseInt(entrada);
                if (parcelas >= 6 && parcelas <= 48) {
                    valido = true;
                } else {
                    System.out.println("Erro: as parcelas devem ficar entre 6 e 48.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um número inteiro (ex.: 12).");
            }
        }

        double taxaJuros = 0.03;

        double valorTotal = emprestimo + (emprestimo * taxaJuros * parcelas);
        double valorParcela = valorTotal / parcelas;

        System.out.println("\nOlá, " + nome + "!");
        System.out.printf("Valor total pago: R$ %.2f%n", valorTotal);
        System.out.printf("Valor da parcela mensal: R$ %.2f%n", valorParcela);

        scanner.close();
    }
}
