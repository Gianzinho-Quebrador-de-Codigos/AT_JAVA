package org.example;

import java.util.Scanner;

public class Ex2 {
    // Pede uma senha até ela cumprir as regras de tamanho e caracteres.
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

            // Verifica se a senha tem letra maiúscula, número e caractere especial.
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

            // Mostra a primeira regra que falhou ou aceita a senha.
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
