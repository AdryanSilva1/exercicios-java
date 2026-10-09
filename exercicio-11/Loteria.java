import java.util.Random;
import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] sorteados = new int[6];
        int[] palpites = new int[6];
        int acertos = 0;


        for (int i = 0; i < 6; i++) {
            int numero = gerador.nextInt(60) + 1;
            boolean repetido = false;
            for (int j = 0; j < i; j++) {
                if (sorteados[j] == numero) {
                    repetido = true;
                }
            }
            if (repetido) {
                i--;
            } else {
                sorteados[i] = numero;
            }
        }


        for (int i = 0; i < 6; i++) {
            boolean valido = false;
            while (!valido) {
                System.out.print("Digite o número " + (i + 1) + " (1 a 60): ");
                int numero = scanner.nextInt();
                valido = true;

                if (numero < 1 || numero > 60) {
                    System.out.println("Número inválido. Digite de 1 a 60.");
                    valido = false;
                } else {
                    for (int j = 0; j < i; j++) {
                        if (palpites[j] == numero) {
                            System.out.println("Você já digitou esse número. Escolha outro.");
                            valido = false;
                        }
                    }
                }
                if (valido) {
                    palpites[i] = numero;
                }
            }
        }


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (palpites[i] == sorteados[j]) {
                    acertos++;
                }
            }
        }

        System.out.println();
        System.out.print("Números sorteados:");
        for (int i = 0; i < 6; i++) {
            System.out.print(" " + sorteados[i]);
        }
        System.out.println();
        System.out.println("Você acertou " + acertos + " número(s).");

        scanner.close();
    }
}