import java.util.Scanner;

public class Aluno {
    String nome, matricula;
    float n1, n2, n3, media;

    public float calcularMedia() {
        media = (n1 + n2 + n3) / 3;
        return media;
    }

    public void verificarAprovacao() {
        if (media >= 7) {
            System.out.println("Você foi aprovado!");
        } else {
            System.out.println("Você foi reprovado.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno meuAluno = new Aluno();

        System.out.print("Nome: ");
        meuAluno.nome = scanner.nextLine();

        System.out.print("Matrícula: ");
        meuAluno.matricula = scanner.nextLine();

        System.out.print("Nota 1: ");
        meuAluno.n1 = scanner.nextFloat();
        while (meuAluno.n1 < 0 || meuAluno.n1 > 10) {
            System.out.print("Nota inválida (0 a 10). Digite de novo: ");
            meuAluno.n1 = scanner.nextFloat();
        }

        System.out.print("Nota 2: ");
        meuAluno.n2 = scanner.nextFloat();
        while (meuAluno.n2 < 0 || meuAluno.n2 > 10) {
            System.out.print("Nota inválida (0 a 10). Digite de novo: ");
            meuAluno.n2 = scanner.nextFloat();
        }

        System.out.print("Nota 3: ");
        meuAluno.n3 = scanner.nextFloat();
        while (meuAluno.n3 < 0 || meuAluno.n3 > 10) {
            System.out.print("Nota inválida (0 a 10). Digite de novo: ");
            meuAluno.n3 = scanner.nextFloat();
        }

        meuAluno.calcularMedia();

        System.out.println();
        System.out.println("Aluno: " + meuAluno.nome + " (Matrícula: " + meuAluno.matricula + ")");
        System.out.println("Média: " + meuAluno.media);
        meuAluno.verificarAprovacao();

        scanner.close();
    }
}