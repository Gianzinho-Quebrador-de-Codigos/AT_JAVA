package org.example;

public class Veiculo {
    String placa;
    String modelo;
    int anoFabricacao;
    double quilometragem;

    // Mostra os dados do veículo.
    public void exibirDetalhes(){
        System.out.println("Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", quilometragem=" + quilometragem +
                '}');
    }

    // Soma a distância da viagem à quilometragem do veículo.
    public void registrarViagem(double km){
        quilometragem += km;
    }


}
