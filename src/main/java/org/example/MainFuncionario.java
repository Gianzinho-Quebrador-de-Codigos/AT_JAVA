package org.example;

public class MainFuncionario {
    static void main() {
        Gerente gerente = new Gerente("João", 8000);
        Estagiario estagiario = new Estagiario("Roberto", 2000);

        System.out.println("Salário Gerente: R$" + gerente.salarioBase);
        System.out.println("Salário Estagiário: R$" + estagiario.salarioBase);
    }
}
