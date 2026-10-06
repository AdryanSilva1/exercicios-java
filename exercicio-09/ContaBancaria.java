public class ContaBancaria {
    String titular;
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido, deve ser maior que 0.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque inválido, saldo insuficiente ou valor incorreto.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.titular = "Adryan";

        minhaConta.depositar(500);
        minhaConta.exibirSaldo();

        minhaConta.sacar(200);
        minhaConta.exibirSaldo();

        minhaConta.sacar(1000);
        minhaConta.depositar(-50); // valor inválido
        minhaConta.exibirSaldo();
    }
}