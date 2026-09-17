package org.example;

import java.util.Scanner;

public class Ex3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe seu salário mensal:");
        double salario = scanner.nextDouble() * 12;

        double imposto = 0;
        if (salario >= 22847.77 && salario <= 33919.80){
            imposto = salario * 0.075;
        } else if (salario >= 33919.81 && salario <= 45012.60) {
            imposto = salario * 0.15;
        } else if (salario >= 45012.61) {
            imposto = salario * 0.275;
        }
        double salarioLiq = salario - imposto;

        System.out.printf("Imposto: %.2f%n", imposto);
        System.out.printf("Salário líquido: %.2f%n", salarioLiq);

    }
}
