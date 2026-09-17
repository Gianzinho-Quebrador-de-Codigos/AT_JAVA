package org.example;

public class MainVeiculosEx6 {
    // Cria dois veículos, registra viagens e mostra a quilometragem de cada um.
    static void main() {
        Veiculo bugatti = new Veiculo();
        bugatti.placa = "ABC123";
        bugatti.modelo = "Esportivo";
        bugatti.quilometragem = 0;
        bugatti.anoFabricacao = 2020;

        Veiculo fusca = new Veiculo();
        fusca.placa = "BCA123";
        fusca.modelo = "Premium";
        fusca.quilometragem = 4000;
        fusca.anoFabricacao = 1980;

        fusca.registrarViagem(2000);
        bugatti.registrarViagem(100);

        System.out.println("Fusca Km: " + fusca.quilometragem);
        System.out.println("Bugatti Km: " + bugatti.quilometragem);
    }
}
