package org.example;

import java.util.Scanner;

public class Ex12 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o nome do primeiro usuário: ");
        String usuarioA = scanner.nextLine();
        System.out.print("Insira o nome do segundo usuário: ");
        String usuarioB = scanner.nextLine();

        String[] mensagens = new String[10];

        for (int i = 0; i < mensagens.length; i++) {
            System.out.print(usuarioA + ", digite sua mensagem: ");
            mensagens[i] = scanner.nextLine();

            i++;

            if (i < mensagens.length) {
                System.out.print(usuarioB + ", digite sua mensagem: ");
                mensagens[i] = scanner.nextLine();
            }
        }

        System.out.println("\n=== Histórico de Mensagens ===");
        for (int i = 0; i < mensagens.length; i++) {
            System.out.println(usuarioA + ": " + mensagens[i]);

            i++;

            if (i < mensagens.length){
                System.out.println(usuarioB + ": " + mensagens[i]);
            }
        }
        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! \uD83D\uDE80");

    }
}
