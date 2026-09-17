package org.example;

public class Estagiario extends Funcionario{
    public Estagiario(String nome, double salarioBase) {
        super(nome, (salarioBase * 0.10) + salarioBase);
    }
}
