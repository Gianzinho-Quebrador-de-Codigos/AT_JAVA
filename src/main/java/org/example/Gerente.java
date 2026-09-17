package org.example;

public class Gerente extends Funcionario{

    // Cria um gerente com acréscimo de 20% no salário informado.
    public Gerente(String nome, double salarioBase) {
        super(nome, (salarioBase * 0.20) + salarioBase);
    }
}
