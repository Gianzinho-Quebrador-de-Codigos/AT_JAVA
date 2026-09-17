package org.example;

import java.util.Random;
import java.util.Scanner;

public class Ex11 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numerosSorteados = new int[6];
        int[] numerosUsuario = new int[6];

        for (int i = 0; i < 6; i++) {
            numerosSorteados[i] = random.nextInt(60) + 1;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numerosUsuario[i] = scanner.nextInt();
        }

        int acertos = 0;

        for (int i = 0; i < 6; i++) {
            for (int b = 0; b < 6; b++) {

                if (numerosUsuario[i] == numerosSorteados[b]) {
                    acertos++;
                    break;
                }
            }
        }

        System.out.println("Você teve " + acertos + " acerto(s)!");

    }
}
