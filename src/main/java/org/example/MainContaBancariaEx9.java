package org.example;

public class MainContaBancariaEx9 {
    // Cria uma conta e testa consultas de saldo, saques e depósito.
    static void main() {
        ContaBancaria conta = new ContaBancaria("Gianlucca", 5000);

        conta.exibirSaldo();
        conta.sacar(2000);
        conta.exibirSaldo();
        // Este saque será recusado, pois só há 3000 reais na conta.
        conta.sacar(6000);
        conta.depositar(4000);
        conta.exibirSaldo();
    }
}
