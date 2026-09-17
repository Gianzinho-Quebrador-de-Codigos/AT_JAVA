package org.example;

import java.util.Scanner;

public class Ex4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe o valor do empréstimo:");
        double emprestimo = scanner.nextDouble();

        System.out.println("Em quantas parcelas deseja pagar? (6 a 48)");
        int parcelas = scanner.nextInt();

        while (parcelas < 6 || parcelas > 48) {
            System.out.println("Número de parcelas inválido.");
            System.out.println("Digite um valor entre 6 e 48:");
            parcelas = scanner.nextInt();
        }

        double juros = emprestimo * 0.03 * parcelas;
        double valorTotal = emprestimo + juros;
        double valorParcela = valorTotal / parcelas;

        System.out.printf("Valor total pago: %.2f%n", valorTotal);
        System.out.printf("Valor da parcela mensal: %.2f%n", valorParcela);

    }
}
