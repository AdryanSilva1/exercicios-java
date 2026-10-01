import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        double salarioMensal = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print("Digite seu salário mensal: ");
            String entrada = scanner.nextLine();

            try {
                salarioMensal = Double.parseDouble(entrada);
                if (salarioMensal > 0) {
                    valido = true;
                } else {
                    System.out.println("Erro: o salário deve ser maior que zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um número válido (ex.: 3500.50).");
            }
        }

        double salarioAnual = salarioMensal * 12;
        double aliquota;

        if (salarioAnual <= 22847.76) {
            aliquota = 0;
        } else if (salarioAnual <= 33919.80) {
            aliquota = 7.5;
        } else if (salarioAnual <= 45012.60) {
            aliquota = 15;
        } else {
            aliquota = 27.5;
        }

        double imposto = salarioMensal * (aliquota / 100);
        double salarioLiquido = salarioMensal - imposto;

        System.out.println("\nOlá, " + nome + "!");
        if (aliquota == 0) {
            System.out.println("Você está isento do imposto de renda.");
        } else {
            System.out.println("Alíquota aplicada: " + aliquota + "%");
        }
        System.out.printf("Valor do imposto: R$ %.2f%n", imposto);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}