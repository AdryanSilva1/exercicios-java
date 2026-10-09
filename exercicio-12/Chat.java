import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro usuário: ");
        String nomePessoaA = scanner.nextLine();

        System.out.print("Digite o nome do segundo usuário: ");
        String nomePessoaB = scanner.nextLine();

        String[] mensagens = new String[10];

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(nomePessoaA + ", digite sua mensagem: ");
                mensagens[i] = nomePessoaA + ": " + scanner.nextLine();
            } else {
                System.out.print(nomePessoaB + ", digite sua mensagem: ");
                mensagens[i] = nomePessoaB + ": " + scanner.nextLine();
            }
        }

        System.out.println();
        System.out.println("===== Histórico de Mensagens =====");
        for (int i = 0; i < 10; i++) {
            System.out.println(mensagens[i]);
        }

        System.out.println();
        System.out.println("Obrigado por utilizarem o sistema! Boa sorte para vocês! 🚀");

        scanner.close();
    }
}