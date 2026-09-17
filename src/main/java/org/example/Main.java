package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        boolean senhaOk = false;

        while (!senhaOk){

            System.out.println("Digite sua senha: ");
            String senha = scanner.nextLine();

            boolean maiuscula = false;
            boolean numero = false;
            boolean caracterEs = false;

            for(int i = 0; i < senha.length(); i++){
                char b = senha.charAt(i);

                if(Character.isUpperCase(b)){
                    maiuscula = true;
                }

                if(Character.isDigit(b)){
                    numero = true;
                }

                if(!Character.isLetterOrDigit(b)){
                    caracterEs = true;
                }
            }

            if (senha.length() < 8) {
                System.out.println("A senha deve ter no mínimo 8 caracteres.");
            } else if (!maiuscula) {
                System.out.println("A senha deve conter pelo menos uma letra maiúscula.");
            } else if (!numero) {
                System.out.println("A senha deve conter pelo menos um número.");
            } else if (!caracterEs) {
                System.out.println("A senha deve conter pelo menos um caractere especial.");
            } else {
                senhaOk = true;
                System.out.println("Senha válida");
            }
        }

    }
}
