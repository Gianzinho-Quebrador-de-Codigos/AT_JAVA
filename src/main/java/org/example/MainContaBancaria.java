package org.example;

public class MainContaBancaria {
    static void main() {
        ContaBancaria conta = new ContaBancaria("Gianlucca", 5000);

        conta.exibirSaldo();
        conta.sacar(2000);
        conta.exibirSaldo();
        conta.sacar(6000);
        conta.depositar(4000);
        conta.exibirSaldo();
    }
}
