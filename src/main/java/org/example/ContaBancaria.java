package org.example;

public class ContaBancaria {
    String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.printf("Depositando %.2f reais...\n", valor);
    }

    public void sacar(double valor){
        if (saldo < valor){
            System.out.println("Saldo insuficiente.");
        }else {
            saldo -= valor;
            System.out.printf("Sacando %.2f reais...\n", valor);
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo: " + saldo);
    }
}
