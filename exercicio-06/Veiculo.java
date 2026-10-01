public class Veiculo {
    String placa, modelo;
    int anoFabricacao;
    double quilometragem;

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + quilometragem);
    }

    public void registrarViagem(double km) {
        quilometragem += km;
    }

    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo();
        carro1.placa = "CAB-1H47";
        carro1.modelo = "Byady V8 Turbo";
        carro1.anoFabricacao = 2024;
        carro1.quilometragem = 200;

        Veiculo carro2 = new Veiculo();
        carro2.placa = "XYZ-9K21";
        carro2.modelo = "Fiat Argo";
        carro2.anoFabricacao = 2020;
        carro2.quilometragem = 45000;

        System.out.println("=== Antes das viagens ===");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();

        carro1.registrarViagem(100);
        carro2.registrarViagem(350.5);

        System.out.println("=== Depois das viagens ===");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}