class Funcionario {
    String nome;
    double salarioBase;

    double calcularSalarioFinal() {
        return salarioBase;
    }
}

class Gerente extends Funcionario {
    double calcularSalarioFinal() {
        return salarioBase * 1.2;
    }
}

class Estagiario extends Funcionario {
    double calcularSalarioFinal() {
        return salarioBase * 0.9;
    }
}

class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.nome = "Carlos";
        gerente.salarioBase = 5000;

        Estagiario estagiario = new Estagiario();
        estagiario.nome = "Ana";
        estagiario.salarioBase = 1500;

        System.out.println("Gerente " + gerente.nome + ": " + gerente.calcularSalarioFinal());
        System.out.println("Estagiário " + estagiario.nome + ": " + estagiario.calcularSalarioFinal());
    }
}