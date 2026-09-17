package org.example;

public class Veiculo {
    String placa;
    String modelo;
    int anoFabricacao;
    double quilometragem;

    public void exibirDetalhes(){
        System.out.println("Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", quilometragem=" + quilometragem +
                '}');
    }

    public void registrarViagem(double km){
        quilometragem += km;
    }


}
