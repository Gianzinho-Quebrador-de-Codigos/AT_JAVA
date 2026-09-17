package org.example;

public class MainFuncionarioEx8 {
    // Cria um gerente e um estagiário e mostra seus salários com os acréscimos.
    static void main() {
        Gerente gerente = new Gerente("João", 8000);
        Estagiario estagiario = new Estagiario("Roberto", 2000);

        System.out.println("Salário Gerente: R$" + gerente.salarioBase);
        System.out.println("Salário Estagiário: R$" + estagiario.salarioBase);
    }
}
