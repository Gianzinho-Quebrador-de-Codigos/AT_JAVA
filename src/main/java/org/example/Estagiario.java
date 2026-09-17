package org.example;

public class Estagiario extends Funcionario{
    // Cria um estagiário com acréscimo de 10% no salário informado.
    public Estagiario(String nome, double salarioBase) {
        super(nome, (salarioBase * 0.10) + salarioBase);
    }
}
