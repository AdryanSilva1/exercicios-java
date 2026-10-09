import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ComprasEmArquivo {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter escritor = new FileWriter("compras.txt");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Compra " + i);

            System.out.print("Digite o produto: ");
            String produto = scanner.nextLine();

            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();

            System.out.print("Digite o preço unitário: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            escritor.write("Produto: " + produto + " | Quantidade: " + quantidade + " | Preço: R$ " + preco + "\n");
        }
        escritor.close();

        System.out.println();
        System.out.println("Compras registradas:");
        Scanner leitor = new Scanner(new File("compras.txt"));
        while (leitor.hasNextLine()) {
            System.out.println(leitor.nextLine());
        }
        leitor.close();
        scanner.close();
    }
}