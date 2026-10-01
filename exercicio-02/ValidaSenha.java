import java.util.Scanner;

public class ValidaSenha {
    public static boolean senhaValida(String senha) {
        boolean temMaiuscula = false;
        boolean temNumero = false;
        boolean temEspecial = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            } else if (Character.isDigit(c)) {
                temNumero = true;
            } else if (!Character.isLetter(c)) {
                temEspecial = true;
            }
        }

        if (senha.length() < 8) {
            System.out.println("Erro: a senha deve ter no mínimo 8 caracteres.");
        }
        if (!temMaiuscula) {
            System.out.println("Erro: a senha deve ter pelo menos uma letra maiúscula.");
        }
        if (!temNumero) {
            System.out.println("Erro: a senha deve ter pelo menos um número.");
        }
        if (!temEspecial) {
            System.out.println("Erro: a senha deve ter pelo menos um caractere especial (@, #, $, etc.).");
        }

        return senha.length() >= 8 && temMaiuscula && temNumero && temEspecial;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String senha;
        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();
        } while (!senhaValida(senha));

        System.out.println("Senha válida! Cadastro de " + nome + " concluído.");
        scanner.close();
    }
}