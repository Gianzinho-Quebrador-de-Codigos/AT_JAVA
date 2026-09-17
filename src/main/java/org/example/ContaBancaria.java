package org.example;

public class ContaBancaria {
    String titular;
    private double saldo;

    // Cria a conta com o titular e o saldo inicial.
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Soma o valor informado ao saldo.
    public void depositar(double valor){
        saldo += valor;
        System.out.printf("Depositando %.2f reais...\n", valor);
    }

    // Retira o valor informado se houver saldo suficiente.
    public void sacar(double valor){
        if (saldo < valor){
            System.out.println("Saldo insuficiente.");
        }else {
            saldo -= valor;
            System.out.printf("Sacando %.2f reais...\n", valor);
        }
    }

    // Mostra o saldo atual da conta.
    public void exibirSaldo(){
        System.out.println("Saldo: " + saldo);
    }
}
